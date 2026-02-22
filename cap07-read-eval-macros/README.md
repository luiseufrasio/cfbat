# Capítulo 7 — Clojure Alchemy: Reading, Evaluation, and Macros

**Livro:** [Clojure for the Brave and True](https://www.braveclojure.com/read-and-eval/)

## Sobre o capítulo

Como Clojure lê, avalia e executa código — a base para entender macros:

- O processo de leitura: `read-string`
- O processo de avaliação
- Estruturas de dados como código (homoiconicidade)
- Quoting com `'` e `quote`
- Avaliação de símbolos e listas
- Introdução a macros: `defmacro`, `macroexpand`
- Diferença entre funções e macros

## Solução

Arquivo de soluções: [`../src/cfbat/cap07_read_eval_macros.clj`](../src/cfbat/cap07_read_eval_macros.clj)

---

## Conceitos-chave

```clojure
;; read-string transforma string em estrutura de dados
(read-string "(+ 1 2)")   ; => (+ 1 2)
(eval (read-string "(+ 1 2)"))  ; => 3

;; Quoting previne avaliação
'(+ 1 2)    ; => (+ 1 2)  (lista, não avaliada)
(+ 1 2)     ; => 3        (avaliada)

;; Macros são expandidas antes da avaliação
(macroexpand '(when true (println "yes")))
;; => (if true (do (println "yes")))
```

---

## Exercícios

### Exercício 1

Use as funções `list`, quoting e `read-string` para criar uma lista que,
quando avaliada, imprima seu primeiro nome e seu filme de ficção científica favorito.

```clojure
;; Exemplo de resultado esperado (adapte para seu nome e filme):
;; A expressão deve imprimir algo como:
;; "Ada Blade Runner"

;; Dica: combine list, quote e read-string para montar a expressão
(eval (list 'println "Ada" "Blade Runner"))
;; => Ada Blade Runner
```

---

### Exercício 2

Crie uma função `infix` que receba uma lista como `(1 + 3 * 4 - 5)` e a
transforme nas listas que Clojure precisa para avaliar a expressão corretamente,
respeitando as regras de precedência de operadores (`*` e `/` antes de `+` e `-`).

```clojure
;; Exemplo de uso esperado:
(infix '(1 + 3 * 4 - 5))
;; A expressão (1 + 3 * 4 - 5) em notação infix padrão é:
;; 1 + (3 * 4) - 5 = 1 + 12 - 5 = 8

;; Deve produzir a forma Clojure equivalente e avaliá-la como 8

;; Dica: você precisará reordenar os elementos e agrupar por precedência
```

---

## Links

- [Capítulo online](https://www.braveclojure.com/read-and-eval/)
