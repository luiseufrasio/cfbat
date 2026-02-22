# Capítulo 3 — Do Things: A Clojure Crash Course

**Livro:** [Clojure for the Brave and True](https://www.braveclojure.com/do-things/)

## Sobre o capítulo

Introdução à sintaxe e aos conceitos fundamentais de Clojure:

- Formas, operações e operandos
- Fluxo de controle: `if`, `do`, `when`
- Nomeação de valores com `def`
- Funções: `defn`, parâmetros, aridade variável, desestruturação
- Estruturas de dados: maps, vectors, lists, sets
- Funções de ordem superior: `map`, `filter`, `reduce`
- Programação funcional com Clojure

## Solução

Arquivo de soluções: [`../src/cfbat/cap03_do_things.clj`](../src/cfbat/cap03_do_things.clj)

---

## Exercícios

### Exercício 1

Use as funções `str`, `vector`, `list`, `hash-map` e `hash-set`.

```clojure
;; Exemplos de uso esperado:
(str "Hello" " " "World")     ; => "Hello World"
(vector 1 2 3)                 ; => [1 2 3]
(list 1 2 3)                   ; => (1 2 3)
(hash-map :a 1 :b 2)          ; => {:a 1, :b 2}
(hash-set 1 1 2 2 3)          ; => #{1 2 3}
```

---

### Exercício 2

Escreva uma função que receba um número e adicione 100 a ele.

```clojure
;; Exemplo de uso esperado:
(add-100 1)   ; => 101
(add-100 50)  ; => 150
```

---

### Exercício 3

Escreva uma função `dec-maker` que funcione exatamente como `inc-maker`,
mas com subtração.

```clojure
;; inc-maker (dado no livro):
(defn inc-maker
  [inc-by]
  (fn [x] (+ x inc-by)))

;; Exemplo de uso esperado:
(def dec9 (dec-maker 9))
(dec9 10)  ; => 1
```

---

### Exercício 4

Escreva uma função `mapset` que funcione como `map`, mas retorne um conjunto (set).

```clojure
;; Exemplo de uso esperado:
(mapset inc [1 1 2 2])  ; => #{2 3}
```

---

### Exercício 5

Crie uma função similar a `symmetrize-body-parts` (do livro) que funcione com
alienígenas com simetria radial — cinco partes de cada lado ao invés de duas.

```clojure
;; symmetrize-body-parts original do livro:
(defn symmetrize-body-parts
  [asym-body-parts]
  (reduce (fn [final-body-parts part]
            (into final-body-parts (set [part (matching-part part)])))
          []
          asym-body-parts))

;; Sua função deve retornar cinco partes simétricas para cada parte.
```

---

### Exercício 6

Crie uma função que generalize `symmetrize-body-parts` e a função do Exercício 5.
Ela deve receber uma coleção de partes do corpo **e o número de partes simétricas**
a adicionar.

```clojure
;; Exemplo de uso esperado:
(generalize-symmetrize asym-body-parts 2)  ; comportamento original
(generalize-symmetrize asym-body-parts 5)  ; comportamento do Exercício 5
```

---

## Links

- [Capítulo online](https://www.braveclojure.com/do-things/)
