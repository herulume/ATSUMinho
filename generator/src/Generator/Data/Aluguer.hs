module Generator.Data.Aluguer (Aluguer, genAlugueres) where

import Control.Applicative
import Control.Monad
import Data.List
import Generator.CondGen
import Generator.Data.Types
import Generator.PrettyPrinter
import Test.QuickCheck

data Aluguer = Aluguer Nif Pos Pos Tipo Preferencia deriving (Show)

data Preferencia = MaisPerto | MaisBarato deriving (Show)

instance Arbitrary Preferencia where
  arbitrary = genPref

instance Arbitrary Aluguer where
  arbitrary = genAluguer

instance PrettyPrinter Aluguer where
  pp (Aluguer nif x y t p) = ("Aluguer:" <>) . join . intersperse "," $ [nif, show x, show y, show t, show p]

genAlugueres :: [Nif] -> Gen [Aluguer]
genAlugueres nifs = genMultiFrom nifs $ \nif (Aluguer _ x y t p) -> Aluguer nif x y t p

genAluguer :: Gen Aluguer
genAluguer = Aluguer <$> genNIF <*> genPos <*> genPos <*> arbitrary <*> arbitrary

genPref :: Gen Preferencia
genPref = elements [MaisPerto, MaisBarato]
