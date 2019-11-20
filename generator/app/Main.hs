module Main where

import Data.Semigroup ((<>))
import Generator
import Options.Applicative
import Test.QuickCheck

main :: IO ()
main = checkSize =<< execParser opts
  where
    opts =
      info
        (cli <**> helper)
        ( fullDesc
            <> progDesc "Gera um ficheiro de logs para UmCarroJa"
            <> header "generator - gerador de valores aleatorios para UmCarroJa"
        )

checkSize :: Cli -> IO ()
checkSize (Cli props clientes)
  | props >= 0 && clientes >= 0 = generate (gen props clientes) >>= print
  | otherwise = return ()

data Cli
  = Cli
      { prop :: Int,
        clientes :: Int
      }

cli :: Parser Cli
cli =
  Cli
    <$> option
      auto
      ( long "clientes"
          <> short 'c'
          <> help "Numero de clientes"
          <> showDefault
          <> value 20
          <> metavar "INT"
      )
    <*> option
      auto
      ( long "proprietarios"
          <> short 'p'
          <> help "Numero de proprietarios"
          <> showDefault
          <> value 20
          <> metavar "INT"
      )
