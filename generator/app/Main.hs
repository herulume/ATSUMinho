module Main where

import Generator
import Generator.PrettyPrinter
import Test.QuickCheck

main :: IO ()
main = sample (pp <$> (arbitrary :: Gen Cliente))
