module Generator.Data.Actor (Cliente (..), Prop (..), genClientes, genProps) where

import Control.Applicative
import Control.Monad
import Control.Monad.Trans.Class
import Control.Monad.Trans.State
import Data.List
import Generator.CondGen
import Generator.Data.Types
import Generator.PrettyPrinter
import Test.QuickCheck

data Cliente = Cliente Nome Nif Email Morada Pos Pos deriving (Show)

data Prop = Prop Nome Nif Email Morada deriving (Show)

type Nome = String

type Email = String

type Morada = String

instance Arbitrary Cliente where
  arbitrary = genCliente

instance PrettyPrinter Cliente where
  pp (Cliente n nif e m x y) = ("NovoCliente:" <>) . join . intersperse "," $ [n, nif, e, m, show x, show y]

instance PrettyPrinter Prop where
  pp (Prop n nif e m) = ("NovoProp:" <>) . join . intersperse "," $ [n, nif, e, m]

instance Arbitrary Prop where
  arbitrary = genProp

genClientes :: Int -> Gen [Cliente]
genClientes n = genMultiCond n $ \a@(Cliente _ nif _ _ _ _) -> (a, nif)

genProps :: Int -> Gen [Prop]
genProps n = genMultiCond n $ \a@(Prop _ nif _ _) -> (a, nif)

genCliente :: Gen Cliente
genCliente = do
  n <- genNome
  nif <- genNIF
  let email = genEmail nif
  morada <- genMorada
  x <- genPos
  Cliente n nif email morada x <$> genPos

genProp :: Gen Prop
genProp = do
  l <- frequency [(40, pure nomesPropriosM), (60, pure nomesPropriosF)]
  n <- elements l
  nif <- genNIF
  let email = genEmail nif
  Prop n nif email <$> genMorada

genEmail :: Nif -> Email
genEmail = (<> "@notMail.com")

genMorada :: Gen Morada
genMorada = elements distritos

genNome :: Gen Nome
genNome = do
  l <- frequency [(40, pure nomesPropriosM), (60, pure nomesPropriosF)]
  nome <- elements l
  n <- choose (1, 4)
  apelido <- getGen (genApelido n) []
  return . join . intersperse " " $ (nome : apelido)

genApelido :: Int -> CondGen [String] [String]
genApelido 0 = pure []
genApelido n = do
  l <- get
  a <- lift $ elements apelidos
  if a `elem` l
    then genApelido n
    else put (a : l) >> genApelido (n -1) >>= \u -> return (a : u)

nomesPropriosM :: [Nome]
nomesPropriosM =
  [ "Eduardo",
    "Bruno",
    "Filipe",
    "Bernardo",
    "Paulo",
    "Joel",
    "Francisco",
    "Miguel",
    "Mateus",
    "Daniel",
    "Lucas",
    "Fabio",
    "Joao",
    "Vinicius",
    "Alberto",
    "Abel",
    "Antonio",
    "Alcino",
    "Jose",
    "Alex",
    "Andre",
    "Armando",
    "Afonso"
  ]

nomesPropriosF :: [Nome]
nomesPropriosF =
  [ "Joana",
    "Ana",
    "Barbara",
    "Catarina",
    "Jessica",
    "Isabel",
    "Maria",
    "Marta",
    "Margarida",
    "Sara",
    "Gabriela",
    "Cristina",
    "Cristiana",
    "Xana",
    "Francisca",
    "Mariana",
    "Carolina",
    "Beatriz",
    "Ines",
    "Adriana",
    "Ariana",
    "Paula",
    "Carla"
  ]

apelidos :: [Nome]
apelidos =
  [ "Jorge",
    "Pinto",
    "Barbosa",
    "Correia",
    "Martins",
    "Gama",
    "Fernandes",
    "Silva",
    "Simoes",
    "Cortez",
    "Matos",
    "Cardoso",
    "Oliveira",
    "Freitas",
    "Miranda",
    "Morais",
    "Veloso",
    "Machado",
    "Castro",
    "Rodrigues",
    "Antunes",
    "Pinheiro",
    "Pereira",
    "Figueiredo",
    "da Silva",
    "de Corte-Real",
    "de Lima",
    "de Beir",
    "de Amorim"
  ]

distritos :: [Morada]
distritos =
  [ "Aveiro",
    "Beja",
    "Braga",
    "Bragança",
    "Castelo Branco",
    "Coimbra",
    "Evora",
    "Faro",
    "Guarda",
    "Leiria",
    "Lisboa",
    "Portalegre",
    "Porto",
    "Setubal",
    "Viana do Castelo",
    "Vila Real",
    "Viseu",
    "Acores",
    "Madeira"
  ]
