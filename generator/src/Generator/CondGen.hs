module Generator.CondGen (CondGen, getGen, genMultiCond, genMultiCondFrom, genMultiFrom) where

import Control.Monad.Trans.Class
import Control.Monad.Trans.State
import Test.QuickCheck

type CondGen st a = StateT st Gen a

getGen :: CondGen st a -> st -> Gen a
getGen = evalStateT

genMultiCond :: (Arbitrary a, Eq b) => Int -> (a -> (a, b)) -> Gen [a]
genMultiCond n f = getGen (genMultiCond' n f) []

genMultiCondFrom :: (Arbitrary a, Eq c) => [b] -> (b -> a -> a) -> (a -> c) -> Gen [a]
genMultiCondFrom bs f g = getGen (genMultiCondFrom' f g) (bs, [])

genMultiFrom :: (Arbitrary a) => [b] -> (b -> a -> a) -> Gen [a]
genMultiFrom bs f = getGen (genMultiFrom' f) bs

genMultiCond' :: (Arbitrary a, Eq b) => Int -> (a -> (a, b)) -> CondGen [b] [a]
genMultiCond' 0 _ = pure []
genMultiCond' n f = do
  l <- get
  z <- lift arbitrary
  let (a, un) = f z
  if un `elem` l
    then genMultiCond' n f
    else put (un : l) >> genMultiCond' (n -1) f >>= \u -> return (a : u)

genMultiCondFrom' :: (Arbitrary a, Eq c) => (b -> a -> a) -> (a -> c) -> CondGen ([b], [c]) [a]
genMultiCondFrom' f g = do
  (l, c) <- get
  if null l
    then return []
    else do
      z <- lift arbitrary
      let p = g z
      if p `elem` c
        then genMultiCondFrom' f g
        else do
          let n = f (head l) z
          put (tail l, p : c)
          u <- genMultiCondFrom' f g
          return (n : u)

genMultiFrom' :: (Arbitrary a) => (b -> a -> a) -> CondGen [b] [a]
genMultiFrom' f = do
  l <- get
  z <- lift arbitrary
  if null l
    then return []
    else do
      let p = f (head l) z
      put (tail l)
      u <- genMultiFrom' f
      return (p : u)
