# generator

## Install

- This project uses Stack, install it if you dont have it.
```
curl -sSL https://get.haskellstack.org/ | sh
```

- Install 3rd party haskell libraries. Run it in the project's root directory.
```
stack build
```

## Running

All commands are expected to be run in the project's root directory.
Running `stack run` will print a helpful message how to run the program.
Since we are running this with stack, we need to add `--` before the arguments.

Example:
```
stack run -- -p 2000 -c 2000 -f logs --carros 100 --alugueres 20
```
