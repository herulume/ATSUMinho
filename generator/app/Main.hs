module Main where

import Control.Monad (join)
import Data.List
import Data.Semigroup ((<>))
import Generator
import Options.Applicative
import System.IO
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
checkSize (Cli props clientes fd cars algs)
  | props >= 0 && clientes >= 0 && cars <= props && algs <= clientes && cars >= 0 && algs >= 0 = generate (gen props clientes cars algs) >>= dump fd
  | otherwise = return ()

dump :: FilePath -> Log -> IO ()
dump fd l =
  let cs = f clientes l
      ps = f props l
      cas = f carros l
      als = f alugueres l
      cla = f classific l
   in writeFile fd ("Logs\n" <> cs <> "\n" <> ps <> "\n" <> cas <> "\n" <> als <> "\n" <> cla)
  where
    f g = join . (++ ["\n"]) . intersperse "\n" . toFormatMulti . g

data Cli
  = Cli
      { prop :: Int,
        cliente :: Int,
        ficheiro :: String,
        cars :: Int,
        alugs :: Int
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
      <*> strOption
        ( long "ficheiro"
            <> short 'f'
            <> metavar "FICHEIRO"
            <> help "Ficheiro de dump"
        )
      <*> option
        auto
        ( long "carros"
            <> help "Numero de carros"
            <> metavar "INT"
        )
      <*> option
        auto
        ( long "alugueres"
            <> help "Numero de alugueres"
            <> metavar "INT"
        )
