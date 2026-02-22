;; Para rodar: lein run -m cap05-functional-programming
(ns cap05-functional-programming)

;; ── Dados do capítulo ────────────────────────────────────────────────────────

(def character
  {:name "Smooches McCutes"
   :attributes {:intelligence 10
                :strength     4
                :dexterity    5}})

;; ── Exercício 1 ──────────────────────────────────────────────────────────────
;; Crie a função attr que usa comp para recuperar atributos do personagem.
;;
;; (def intelligence (attr :intelligence))
;; (intelligence character)  ; => 10

(defn attr [attribute]
  ;; TODO: use comp
  )

;; ── Exercício 2 ──────────────────────────────────────────────────────────────
;; Implemente my-comp com o mesmo comportamento de comp.
;;
;; ((my-comp inc *) 2 3)  ; => 7

(defn my-comp [& fns]
  ;; TODO
  )

;; ── Exercício 3 ──────────────────────────────────────────────────────────────
;; Implemente my-assoc-in com o mesmo comportamento de assoc-in.
;;
;; (my-assoc-in {} [:a :b :c] 1)  ; => {:a {:b {:c 1}}}

(defn my-assoc-in [m [k & ks] v]
  ;; TODO
  )

;; ── Exercício 4 ──────────────────────────────────────────────────────────────
;; Pesquise e use a função update-in (built-in do Clojure).
;;
;; (update-in {:a {:b 5}} [:a :b] inc)    ; => {:a {:b 6}}
;; (update-in {:a {:b 5}} [:a :b] + 10)  ; => {:a {:b 15}}

;; ── Exercício 5 ──────────────────────────────────────────────────────────────
;; Implemente my-update-in com o mesmo comportamento de update-in.
;;
;; (my-update-in {:a {:b 5}} [:a :b] inc)  ; => {:a {:b 6}}

(defn my-update-in [m ks f & args]
  ;; TODO: use get-in e assoc-in
  )

;; ── Main ─────────────────────────────────────────────────────────────────────

(defn -main [& args]
  (println "=== Cap 05 — Functional Programming ===")

  (let [intelligence (attr :intelligence)
        strength     (attr :strength)
        dexterity    (attr :dexterity)]

    (println "\n[Ex1] attr:")
    (println "intelligence:" (intelligence character))
    (println "strength:"     (strength character))
    (println "dexterity:"    (dexterity character)))

  (println "\n[Ex2] my-comp:")
  (println ((my-comp inc *) 2 3))

  (println "\n[Ex3] my-assoc-in:")
  (println (my-assoc-in {} [:a :b :c] 1))

  (println "\n[Ex4] update-in (built-in):")
  (println (update-in {:a {:b 5}} [:a :b] inc))
  (println (update-in {:a {:b 5}} [:a :b] + 10))

  (println "\n[Ex5] my-update-in:")
  (println (my-update-in {:a {:b 5}} [:a :b] inc))
  (println (my-update-in {:a {:b 5}} [:a :b] + 10)))
