# Capítulo 8 — Writing Macros

**Livro:** [Clojure for the Brave and True](https://www.braveclojure.com/writing-macros/)

## Sobre o capítulo

Como escrever macros em Clojure:

- `defmacro` e a diferença entre macros e funções
- Syntax quoting com `` ` `` (backtick)
- Unquoting com `~` e unquote-splicing com `~@`
- `macroexpand` para depuração
- Armadilhas comuns: captura de variáveis, avaliação dupla
- `gensym` para evitar captura de variáveis
- Macros para validação de dados

## Solução

Arquivo de soluções: [`../src/cfbat/cap08_writing_macros.clj`](../src/cfbat/cap08_writing_macros.clj)

---

## Contexto dos exercícios

O capítulo usa o sistema de atributos de personagens RPG e um sistema de validação:

```clojure
(def character
  {:name "Smooches McCutes"
   :attributes {:intelligence 10
                :strength 4
                :dexterity 5}})

(defn attr [character attribute]
  (get-in character [:attributes attribute]))

;; Exemplo de macro do livro: and
(defmacro my-and
  ([] true)
  ([x] x)
  ([x & rest]
   `(let [and# ~x]
      (if and# (my-and ~@rest) and#))))
```

---

## Exercícios

### Exercício 1

Escreva a macro `when-valid` — similar a `when`, ela valida dados e só avalia
as formas do corpo se a validação passar (retornando `nil` caso contrário).

```clojure
;; Exemplo de uso esperado:
(when-valid {:name string? :glitter-index integer?}
            {:name "Dracula" :glitter-index 7}
  (println "Suspeito válido!")
  (do-something-else))
;; => imprime "Suspeito válido!" e executa do-something-else

(when-valid {:name string? :glitter-index integer?}
            {:name "Dracula"}
  (println "Nunca chega aqui"))
;; => nil
```

---

### Exercício 2

Implemente `or` como uma macro (assim como `and` é implementado como macro em Clojure).

```clojure
;; or original do Clojure:
(or false nil 42 "nunca chega aqui")  ; => 42
(or false nil false)                   ; => false
(or)                                   ; => nil

;; Sua macro my-or deve ter o mesmo comportamento:
(my-or false nil 42)  ; => 42
(my-or false nil)     ; => nil
(my-or)               ; => nil
```

---

### Exercício 3

Escreva uma macro `defattrs` que defina múltiplas funções de recuperação de
atributos em uma única chamada.

```clojure
;; Exemplo de uso esperado:
(defattrs c
  :intelligence
  :strength
  :dexterity)

;; Deve ser equivalente a definir:
(def c-intelligence (comp :intelligence :attributes))
(def c-strength     (comp :strength :attributes))
(def c-dexterity    (comp :dexterity :attributes))

;; De forma que:
(c-intelligence character)  ; => 10
(c-strength character)      ; => 4
(c-dexterity character)     ; => 5
```

---

## Links

- [Capítulo online](https://www.braveclojure.com/writing-macros/)
