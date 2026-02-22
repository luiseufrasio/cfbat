;; Para rodar: lein run -m cap08-writing-macros
(ns cap08-writing-macros)

;; ── Dados do capítulo ────────────────────────────────────────────────────────

(def character
  {:name "Smooches McCutes"
   :attributes {:intelligence 10
                :strength     4
                :dexterity    5}})

(defn attr [character attribute]
  (get-in character [:attributes attribute]))

(defn validate [validators record]
  (every? (fn [[k v-fn]] (v-fn (get record k))) validators))

;; ── Exercício 1 ──────────────────────────────────────────────────────────────
;; Escreva a macro when-valid: valida os dados e só avalia o corpo se passar.
;;
;; (when-valid {:name string? :glitter-index integer?}
;;             {:name "Dracula" :glitter-index 7}
;;   (println "Válido!"))
;; => imprime "Válido!"
;;
;; (when-valid {:name string? :glitter-index integer?}
;;             {:name "Dracula"}
;;   (println "Nunca chega aqui"))
;; => nil

(defmacro when-valid [validators record & body]
  ;; TODO
  )

;; ── Exercício 2 ──────────────────────────────────────────────────────────────
;; Implemente or como macro (my-or).
;;
;; (my-or false nil 42)   ; => 42
;; (my-or false nil)      ; => nil
;; (my-or)                ; => nil

(defmacro my-or
  ;; TODO
  )

;; ── Exercício 3 ──────────────────────────────────────────────────────────────
;; Escreva a macro defattrs que define múltiplas funções de atributo.
;;
;; (defattrs c :intelligence :strength :dexterity)
;; Deve ser equivalente a:
;; (def c-intelligence (comp :intelligence :attributes))
;; (def c-strength     (comp :strength :attributes))
;; (def c-dexterity    (comp :dexterity :attributes))

(defmacro defattrs [prefix & attributes]
  ;; TODO
  )

;; ── Main ─────────────────────────────────────────────────────────────────────

(defn -main [& args]
  (println "=== Cap 08 — Writing Macros ===")

  (println "\n[Ex1] when-valid (válido):")
  (when-valid {:name string? :glitter-index integer?}
              {:name "Dracula" :glitter-index 7}
    (println "Suspeito válido!"))

  (println "[Ex1] when-valid (inválido):")
  (println (when-valid {:name string? :glitter-index integer?}
                       {:name "Dracula"}
             (println "Nunca chega aqui")))

  (println "\n[Ex2] my-or:")
  (println (my-or false nil 42))
  (println (my-or false nil))
  (println (my-or))

  (println "\n[Ex3] defattrs:")
  (defattrs c :intelligence :strength :dexterity)
  (println "intelligence:" (c-intelligence character))
  (println "strength:"     (c-strength character))
  (println "dexterity:"    (c-dexterity character)))
