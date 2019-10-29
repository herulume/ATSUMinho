module Generator.Data.Classificar (Classificar, genClassificas) where

import Control.Applicative
import Control.Monad
import Data.Bitraversable
import Data.List
import Generator.CondGen
import Generator.Data.Types
import Generator.PrettyPrinter
import Test.QuickCheck

data Classificar = Classificar (Either Matricula Nif) Nota deriving (Show)

type Nota = Int

instance Arbitrary Classificar where
  arbitrary = genClassificar

instance PrettyPrinter Classificar where
  pp (Classificar m n) = ("Classificar:" <>) . join . intersperse "," $ [either id id m, show n]

genClassificas :: [Either Matricula Nif] -> Gen [Classificar]
genClassificas ids = genMultiFrom ids $ \iden (Classificar _ n) -> Classificar iden n

genClassificar :: Gen Classificar
genClassificar = do
  f <- elements [Left genMatricula, Right genNIF]
  i <- bisequence f
  Classificar i <$> genNota

genNota :: Gen Nota
genNota = choose (0, 100)
