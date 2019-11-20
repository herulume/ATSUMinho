module Generator
  ( module Generator.Data,
    toFormat,
    toFormatMulti,
    gen,
  )
where

import Generator.Data
import Generator.PrettyPrinter
import Test.QuickCheck

toFormat :: (PrettyPrinter a) => Gen a -> Gen String
toFormat = fmap pp

toFormatMulti :: (PrettyPrinter a) => Gen [a] -> Gen [String]
toFormatMulti = fmap (fmap pp)

data Log = Log {clientes :: [Cliente], props :: [Prop], carros :: [Carro], alugeres :: [Aluguer], classific :: [Classificar]} deriving (Show)

gen :: Int -> Int -> Gen Log
gen c p = do
  cs <- genClientes c
  ps <- genProps p
  let clientesNif = clientesToNifs cs
      propsNif = propsToNifs ps
  carros <- genCarros propsNif
  alugueres <- genAlugueres clientesNif
  classfics <- genClassificas []
  return $ Log cs ps carros alugueres classfics

clientesToNifs :: [Cliente] -> [Nif]
clientesToNifs = fmap $ \(Cliente _ n _ _ _ _) -> n

propsToNifs :: [Prop] -> [Nif]
propsToNifs = fmap $ \(Prop _ n _ _) -> n
