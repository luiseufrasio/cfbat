# Capítulo 6 — Organizing Your Project: A Librarian's Tale

**Livro:** [Clojure for the Brave and True](https://www.braveclojure.com/organization/)

## Sobre o capítulo

Organização de projetos Clojure com namespaces:

- O que são namespaces e como funcionam
- Criação de namespaces com `ns`
- Importação com `require`, `use` e `import`
- Aliases com `:as`
- `refer` e `:refer`
- A relação entre namespaces e o sistema de arquivos
- Mapeamento de namespaces para arquivos
- Uso de `def` vs `defn` em namespaces

## Conceitos-chave

```clojure
;; Definindo namespace
(ns meu-projeto.core
  (:require [clojure.string :as str]
            [clojure.set :refer [union intersection]]))

;; Usando funções de outros namespaces
(str/join ", " ["a" "b" "c"])  ; => "a, b, c"
(union #{1 2} #{2 3})          ; => #{1 2 3}

;; Requerendo em tempo de execução
(require '[clojure.string :as str])
```

## Exercícios

Este capítulo não possui exercícios formais.

### Sugestões de prática

1. Crie um projeto com múltiplos namespaces e pratique importações com `require`.
2. Experimente `:refer :all` e observe por que pode ser problemático.
3. Crie aliases com `:as` para namespaces com nomes longos.
4. Explore a função `ns-publics` e `ns-map` no REPL para inspecionar namespaces.
5. Entenda como o Leiningen mapeia namespaces para arquivos no filesystem.

## Links

- [Capítulo online](https://www.braveclojure.com/organization/)
