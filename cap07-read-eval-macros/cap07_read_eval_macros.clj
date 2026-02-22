;; Para rodar: lein run -m cap07-read-eval-macros
(ns cap07-read-eval-macros)

;; ── Exercício 1 ──────────────────────────────────────────────────────────────
;; Use list, quoting e read-string para criar uma expressão que imprima
;; seu primeiro nome e seu filme de ficção científica favorito.
;;
;; (eval (list 'println "Seu Nome" "Seu Filme"))
;; => Seu Nome Seu Filme

(defn ex1 []
  ;; TODO: monte a expressão usando list, quote e/ou read-string
  )

;; ── Exercício 2 ──────────────────────────────────────────────────────────────
;; Crie a função infix que transforma (1 + 3 * 4 - 5) em notação Clojure
;; respeitando precedência (* e / antes de + e -).
;;
;; (infix '(1 + 3 * 4 - 5))  ; => 8
;; pois: 1 + (3 * 4) - 5 = 1 + 12 - 5 = 8

(defn infix [expr]
  ;; TODO
  )

;; ── Main ─────────────────────────────────────────────────────────────────────

(defn -main [& args]
  (println "=== Cap 07 — Reading, Evaluation, and Macros ===")

  (println "\n[Ex1] list + quoting + read-string:")
  (ex1)

  (println "\n[Ex2] infix:")
  (println (infix '(1 + 3 * 4 - 5))))
