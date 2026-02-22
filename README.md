# Clojure for the Brave and True — Exercícios

Resoluções dos exercícios do livro [Clojure for the Brave and True](https://www.braveclojure.com/clojure-for-the-brave-and-true/) de Daniel Higginbotham.

## Estrutura do Projeto

```
cfbat/
├── project.clj
├── src/
│   └── cfbat/
│       ├── cap03_do_things.clj
│       ├── cap04_core_functions.clj
│       ├── cap05_functional_programming.clj
│       ├── cap07_read_eval_macros.clj
│       ├── cap08_writing_macros.clj
│       ├── cap09_concurrency.clj
│       ├── cap10_atoms_refs_vars.clj
│       └── cap13_multimethods.clj
├── test/
│   └── cfbat/
│       └── ...
├── cap01-building-running-repl/
├── cap02-emacs/
├── cap03-do-things/
├── cap04-core-functions-in-depth/
├── cap05-functional-programming/
├── cap06-organizing-project/
├── cap07-read-eval-macros/
├── cap08-writing-macros/
├── cap09-concurrency/
├── cap10-atoms-refs-vars/
├── cap11-core-async/
├── cap12-java-interop/
└── cap13-multimethods-records-protocols/
```

## Capítulos

| Capítulo | Título | Exercícios |
|----------|--------|------------|
| 1 | [Building, Running, and the REPL](cap01-building-running-repl/) | — |
| 2 | [How to Use Emacs](cap02-emacs/) | — |
| 3 | [Do Things: A Clojure Crash Course](cap03-do-things/) | 6 |
| 4 | [Core Functions in Depth](cap04-core-functions-in-depth/) | 4 |
| 5 | [Functional Programming](cap05-functional-programming/) | 5 |
| 6 | [Organizing Your Project](cap06-organizing-project/) | — |
| 7 | [Reading, Evaluation, and Macros](cap07-read-eval-macros/) | 2 |
| 8 | [Writing Macros](cap08-writing-macros/) | 3 |
| 9 | [Concurrent and Parallel Programming](cap09-concurrency/) | 3 |
| 10 | [Atoms, Refs, Vars, and Cuddle Zombies](cap10-atoms-refs-vars/) | 3 |
| 11 | [Master Concurrent Processes with core.async](cap11-core-async/) | — |
| 12 | [Interacting with Java](cap12-java-interop/) | — |
| 13 | [Multimethods, Protocols, and Records](cap13-multimethods-records-protocols/) | 4 |

## Como usar

```bash
# Iniciar o REPL
lein repl

# Carregar um namespace de capítulo no REPL
(require '[cfbat.cap03-do-things :as cap03])

# Rodar os testes
lein test
```

## Livro online

O livro está disponível gratuitamente em: https://www.braveclojure.com/
