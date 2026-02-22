# Capítulo 5 — Functional Programming

**Livro:** [Clojure for the Brave and True](https://www.braveclojure.com/functional-programming/)

## Sobre o capítulo

Conceitos de programação funcional aplicados em Clojure:

- Funções puras e imutabilidade
- Recursão com `loop`/`recur`
- Composição de funções com `comp`
- Memorização com `memoize`
- Funções que retornam funções
- `partial` para aplicação parcial de funções
- Trabalhando com dados aninhados: `assoc-in`, `get-in`, `update-in`

## Solução

Arquivo de soluções: [`../src/cfbat/cap05_functional_programming.clj`](../src/cfbat/cap05_functional_programming.clj)

---

## Contexto dos exercícios

O capítulo usa um RPG de exemplo com personagens e atributos:

```clojure
(def character
  {:name "Smooches McCutes"
   :attributes {:intelligence 10
                :strength 4
                :dexterity 5}})

(defn attr [attribute]
  (comp attribute :attributes))

(def intelligence (attr :intelligence))
(def strength     (attr :strength))
(def dexterity    (attr :dexterity))

(intelligence character)  ; => 10
```

---

## Exercícios

### Exercício 1

Crie uma nova função `attr` que funcione como `(attr :intelligence)` para
recuperar atributos de personagens.

```clojure
;; Exemplo de uso esperado:
(def intelligence (attr :intelligence))
(intelligence character)  ; => 10

(def strength (attr :strength))
(strength character)  ; => 4
```

---

### Exercício 2

Implemente a função `comp` você mesmo.

```clojure
;; comp original do Clojure:
;; ((comp inc *) 2 3)  ; => 7  (primeiro * depois inc)

;; Implemente my-comp com o mesmo comportamento:
((my-comp inc *) 2 3)  ; => 7
```

---

### Exercício 3

Implemente a função `assoc-in` você mesmo.

```clojure
;; Dica: use assoc e defina os parâmetros como [m [k & ks] v]

;; assoc-in original:
(assoc-in {} [:a :b :c] 1)  ; => {:a {:b {:c 1}}}

;; Sua implementação deve ter o mesmo comportamento:
(my-assoc-in {} [:a :b :c] 1)  ; => {:a {:b {:c 1}}}
```

---

### Exercício 4

Pesquise e use a função `update-in`.

```clojure
;; Exemplo de uso esperado:
(update-in {:a {:b 5}} [:a :b] inc)  ; => {:a {:b 6}}
(update-in {:a {:b 5}} [:a :b] + 10) ; => {:a {:b 15}}
```

---

### Exercício 5

Implemente `update-in` você mesmo.

```clojure
;; Dica: use get-in e assoc-in

;; update-in original:
(update-in {:a {:b 5}} [:a :b] inc)  ; => {:a {:b 6}}

;; Sua implementação deve ter o mesmo comportamento:
(my-update-in {:a {:b 5}} [:a :b] inc)  ; => {:a {:b 6}}
```

---

## Links

- [Capítulo online](https://www.braveclojure.com/functional-programming/)
