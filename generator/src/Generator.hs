module Generator
  ( module Generator.Data,
    toFormatMulti,
    gen,
    Log (..),
  )
where

import Generator.Data
import Generator.PrettyPrinter
import Test.QuickCheck

toFormatMulti :: (PrettyPrinter a) => [a] -> [String]
toFormatMulti = fmap pp

data Log = Log {clientes :: [Cliente], props :: [Prop], carros :: [Carro], alugueres :: [Aluguer], classific :: [Classificar]} deriving (Show)

gen :: Int -> Int -> Gen Log
gen c p = do
  cs <- genClientes c
  ps <- genProps p
  let clientesNif = clientesToNifs cs
      propsNif = propsToNifs ps
  carros <- genCarros propsNif
  alugueres <- genAlugueres clientesNif
  rMats <- choose (0, length carros)
  rNifsC <- choose (0, length cs)
  rNifsP <- choose (0, length ps)
  let mats = fmap Left . carrosToMatriculas . take rMats $ carros
      nifs = fmap Right $ take rNifsP propsNif <> take rNifsP clientesNif
  classfics <- genClassificas $ mats <> nifs
  return $ Log cs ps carros alugueres classfics

clientesToNifs :: [Cliente] -> [Nif]
clientesToNifs = fmap $ \(Cliente _ n _ _ _ _) -> n

propsToNifs :: [Prop] -> [Nif]
propsToNifs = fmap $ \(Prop _ n _ _) -> n

carrosToMatriculas :: [Carro] -> [Matricula]
carrosToMatriculas = fmap $ \(Carro _ _ m _ _ _ _ _ _ _) -> m
