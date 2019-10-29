module Generator.Data.Types where

import Control.Applicative
import Control.Monad
import Data.List
import Test.QuickCheck

type Nif = String

type Pos = Float

type Matricula = String

data Tipo
  = Gasolina
  | Eletrico
  | Hibrido
  deriving (Show)

instance Arbitrary Tipo where
  arbitrary = genTipo

genNIF :: Gen Nif
genNIF = fmap (fmap (head . show)) . vectorOf 9 $ choose ((0, 9) :: (Int, Int))

genPos :: Gen Pos
genPos = choose (-85.0, 85.0)

genTipo :: Gen Tipo
genTipo = frequency [(70, pure Gasolina), (25, pure Hibrido), (5, pure Eletrico)]

genMatricula :: Gen Matricula
genMatricula =
  let l = con $ pure <$> elements ['A' .. 'Z']
      n = con $ show <$> choose ((0, 9) :: (Int, Int))
   in intercalate "-" <$> sequence [l, n, n]
  where
    con = join (liftA2 (<>))
