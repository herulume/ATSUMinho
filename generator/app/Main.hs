module Main where

import Data.Semigroup ((<>))
import Generator
import Generator.PrettyPrinter
import Options.Applicative

main :: IO ()
main = greet =<< execParser opts
  where
    opts =
      info
        (sample <**> helper)
        ( fullDesc
            <> progDesc "Gera um ficheiro de logs para UmCarroJa"
            <> header "generator - gerador de valores aleatorios para UmCarroJa"
        )

greet :: Sample -> IO ()
greet (Sample prop clientes) = putStrLn $ "Clientes: " <> show clientes <> "\nProprietarios: " <> show prop

data Sample
  = Sample
      { prop :: Int,
        clientes :: Int
      }

sample :: Parser Sample
sample =
  Sample
    <$> option
      auto
      ( long "clientes"
          <> help "Numero de clientes"
          <> showDefault
          <> value 20
          <> metavar "INT"
      )
    <*> option
      auto
      ( long "proprietarios"
          <> help "Numero de proprietarios"
          <> showDefault
          <> value 20
          <> metavar "INT"
      )
