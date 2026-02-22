# Capítulo 4 — Core Functions in Depth

**Livro:** [Clojure for the Brave and True](https://www.braveclojure.com/core-functions-in-depth/)

## Sobre o capítulo

Mergulho nas funções core de Clojure e no conceito de sequências:

- Abstração de sequências: `map`, `reduce`, `filter`, `into`
- Funções de coleção: `first`, `rest`, `cons`, `conj`
- Lazy sequences
- Funções de transformação: `take`, `drop`, `sort`, `sort-by`, `identity`
- `apply`, `partial`
- Trabalhando com strings: `clojure.string/join`, `clojure.string/split`
- Projeto prático: analisador de brilho de vampiros (CSV)

## Solução

Arquivo de soluções: [`../src/cfbat/cap04_core_functions.clj`](../src/cfbat/cap04_core_functions.clj)

---

## Contexto dos exercícios

O capítulo constrói um programa para analisar suspeitos de vampirismo com base
em um índice de brilho (`glitter-index`). O programa lê um CSV, converte os dados
e filtra suspeitos.

```clojure
;; Estrutura de dados do capítulo:
(def filename "suspects.csv")

(def vamp-keys [:name :glitter-index])

(defn str->int [str] (Integer. str))

(def conversions {:name identity
                  :glitter-index str->int})

(defn convert [vamp-keys val]
  ((get conversions vamp-keys) val))

(defn parse [string]
  (map #(clojure.string/split % #",")
       (clojure.string/split string #"\n")))

(defn mapify [rows]
  (map (fn [unmapped-row]
         (reduce (fn [row-map [vamp-key value]]
                   (assoc row-map vamp-key (convert vamp-key value)))
                 {}
                 (map vector vamp-keys unmapped-row)))
       rows))

(defn glitter-filter [minimum-glitter records]
  (filter #(>= (:glitter-index %) minimum-glitter) records))
```

---

## Exercícios

### Exercício 1

Transforme o resultado do seu filtro `glitter-filter` em uma lista de nomes.

```clojure
;; Exemplo de uso esperado:
(glitter-filter 3 (mapify (parse (slurp filename))))
;; => ({:name "Edward" :glitter-index 3} {:name "Bella" :glitter-index 5})

;; Sua função deve retornar apenas os nomes:
;; => ("Edward" "Bella")
```

---

### Exercício 2

Escreva uma função `append` que adicione um novo suspeito à lista de suspeitos.

```clojure
;; Exemplo de uso esperado:
(append {:name "Damon" :glitter-index 1} list-of-suspects)
;; => (lista com o novo suspeito adicionado)
```

---

### Exercício 3

Escreva uma função `validate` que verifique se `:name` e `:glitter-index` estão
presentes ao usar `append`.

A função `validate` deve aceitar dois argumentos:
- Um mapa de palavras-chave para funções de validação (similar a `conversions`)
- O registro a ser validado

```clojure
;; Exemplo de uso esperado:
(validate {:name string? :glitter-index integer?} {:name "Dracula" :glitter-index 7})
;; => true

(validate {:name string? :glitter-index integer?} {:name "Dracula"})
;; => false (faltando :glitter-index)
```

---

### Exercício 4

Escreva uma função que converta sua lista de maps de volta para uma string CSV.

```clojure
;; Dica: use clojure.string/join

;; Exemplo de uso esperado:
(mapify->csv (mapify (parse (slurp filename))))
;; => "Edward,3\nBella,5\n..."
```

---

## Links

- [Capítulo online](https://www.braveclojure.com/core-functions-in-depth/)
