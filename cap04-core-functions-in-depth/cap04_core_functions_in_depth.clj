;; Para rodar: lein run -m cap04-core-functions-in-depth
(ns cap04-core-functions-in-depth
  (:require [clojure.string :as str]))

;; ── Dados do capítulo ────────────────────────────────────────────────────────

(def filename "cap04-core-functions-in-depth/suspects.csv")

(def vamp-keys [:name :glitter-index])

(defn str->int [s] (Integer. s))

(def conversions {:name          identity
                  :glitter-index str->int})

(defn convert [vamp-key val]
  ((get conversions vamp-key) val))

(defn parse [string]
  (map #(str/split % #",")
       (str/split string #"\n")))

(defn mapify [rows]
  (map (fn [unmapped-row]
         (reduce (fn [row-map [vamp-key value]]
                   (assoc row-map vamp-key (convert vamp-key value)))
                 {}
                 (map vector vamp-keys unmapped-row)))
       rows))

(defn glitter-filter [minimum-glitter records]
  (filter #(>= (:glitter-index %) minimum-glitter) records))

;; ── Exercício 1 ──────────────────────────────────────────────────────────────
;; Transforme o resultado de glitter-filter em uma lista de nomes.
;;
;; (names-only (glitter-filter 3 suspects))
;; => ("Edward Cullen" "Carlisle Cullen")

(defn names-only [suspects]
  ;; TODO
  )

;; ── Exercício 2 ──────────────────────────────────────────────────────────────
;; Escreva append que adicione um novo suspeito à lista.
;;
;; (append {:name "Damon" :glitter-index 1} suspects)
;; => (lista com o novo suspeito adicionado)

(defn append [new-suspect suspects]
  ;; TODO
  )

;; ── Exercício 3 ──────────────────────────────────────────────────────────────
;; Escreva validate que verifique :name e :glitter-index.
;;
;; (validate {:name string? :glitter-index integer?} {:name "Dracula" :glitter-index 7})
;; => true
;; (validate {:name string? :glitter-index integer?} {:name "Dracula"})
;; => false

(defn validate [validators record]
  ;; TODO
  )

;; ── Exercício 4 ──────────────────────────────────────────────────────────────
;; Converta a lista de maps de volta para uma string CSV.
;;
;; (maps->csv suspects)
;; => "Edward Cullen,10\nBella Swan,0\n..."

(defn maps->csv [records]
  ;; TODO
  )

;; ── Main ─────────────────────────────────────────────────────────────────────

(defn -main [& args]
  (println "=== Cap 04 — Core Functions in Depth ===")
  (let [suspects (vec (mapify (parse (slurp filename))))]

    (println "\n[Ex1] Nomes com glitter-index >= 3:")
    (println (names-only (glitter-filter 3 suspects)))

    (println "\n[Ex2] Append de novo suspeito:")
    (println (append {:name "Damon Salvatore" :glitter-index 1} suspects))

    (println "\n[Ex3] Validate (válido):")
    (println (validate {:name string? :glitter-index integer?}
                       {:name "Dracula" :glitter-index 7}))
    (println "[Ex3] Validate (inválido):")
    (println (validate {:name string? :glitter-index integer?}
                       {:name "Dracula"}))

    (println "\n[Ex4] Maps -> CSV:")
    (println (maps->csv suspects))))
