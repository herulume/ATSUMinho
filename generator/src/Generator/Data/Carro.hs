module Generator.Data.Carro (Carro, genCarros) where

import Control.Applicative
import Control.Monad
import Data.List
import Generator.CondGen
import Generator.Data.Types
import Generator.PrettyPrinter
import Test.QuickCheck

data Carro = Carro Tipo Marca Matricula Nif VMedia PKm CPKm Autonomia Pos Pos deriving (Show)

type Marca = String

type CPKm = Float

type Autonomia = Float

type PKm = Float

type VMedia = Float

instance Arbitrary Carro where
  arbitrary = genCarro

instance PrettyPrinter Carro where
  pp (Carro t marca mat nif vm pk cpk auto x y) = ("NovoCarro:" <>) . join . intersperse "," $ [show t, marca, mat, nif, nif, show vm, show pk, show cpk, show auto, show x, show y]

genCarros :: [Nif] -> Gen [Carro]
genCarros l = genMultiCondFrom l (\nif (Carro t marca mat _ vm pk cpk aut x y) -> Carro t marca mat nif vm pk cpk aut x y) (\(Carro _ _ mat _ _ _ _ _ _ _) -> mat)

genCarro :: Gen Carro
genCarro = do
  tipo <- genTipo
  marca <- genMarca
  matricula <- genMatricula
  nif <- genNIF
  vm <- genVMedia tipo
  pkm <- genPKm tipo
  cpkm <- genCPKm tipo
  auto <- genAutonomia tipo
  x <- genPos
  Carro tipo marca matricula nif vm pkm cpkm auto x <$> genPos

genCPKm :: Tipo -> Gen CPKm
genCPKm t = case t of
  Gasolina -> choose (4.5, 9)
  Eletrico -> choose (1, 1.5)
  Hibrido -> choose (2, 7)

genVMedia :: Tipo -> Gen VMedia
genVMedia t = case t of
  Gasolina -> choose (20, 210)
  Eletrico -> choose (20, 170)
  Hibrido -> choose (20, 220)

genPKm :: Tipo -> Gen PKm
genPKm t = case t of
  Gasolina -> choose (1.7, 3.7)
  Eletrico -> choose (1, 1.5)
  Hibrido -> choose (1.9, 3.4)

genAutonomia :: Tipo -> Gen Autonomia
genAutonomia t = case t of
  Gasolina -> choose (500, 900)
  Eletrico -> choose (6, 600)
  Hibrido -> choose (450, 800)

genMarca :: Gen Marca
genMarca =
  let marcas = ["Abarth", "Aixam", "Alfa Romeo", "Alpine", "Aston Martin", "Audi", "Austin Healey", "Austin Morris", "Bellier", "Bentley", "BMW", "Cadillac", "Chatenet", "Chevrolet", "Chrysler", "Citroen", "Dacia", "Daewoo", "Daihatsu", "Datsun", "Mercedes-Benz"]
   in elements marcas
