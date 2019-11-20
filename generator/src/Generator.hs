module Generator
  ( module Generator.Data,
    toFormat,
    toFormatMulti,
  )
where

import Generator.Data
import Generator.PrettyPrinter
import Test.QuickCheck

toFormat :: (PrettyPrinter a) => Gen a -> Gen String
toFormat = fmap pp

toFormatMulti :: (PrettyPrinter a) => Gen [a] -> Gen [String]
toFormatMulti = fmap (fmap pp)
