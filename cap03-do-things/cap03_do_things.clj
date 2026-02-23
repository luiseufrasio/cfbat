;; Para rodar: lein run -m cap03-do-things
(ns cap03-do-things)

;; ── Exercício 1 ──────────────────────────────────────────────────────────────
;; Use as funções str, vector, list, hash-map e hash-set.
;;
;; (str "Hello" " " "World")   ; => "Hello World"
;; (vector 1 2 3)               ; => [1 2 3]
;; (list 1 2 3)                 ; => (1 2 3)
;; (hash-map :a 1 :b 2)        ; => {:a 1, :b 2}
;; (hash-set 1 1 2 2 3)        ; => #{1 2 3}

;; ── Exercício 2 ──────────────────────────────────────────────────────────────
;; Escreva uma função que receba um número e adicione 100 a ele.

(defn add-100 [n]
  (+ n 100))

;; ── Exercício 3 ──────────────────────────────────────────────────────────────
;; Escreva dec-maker, similar a inc-maker mas com subtração.

(defn inc-maker [inc-by]
  (fn [x] (+ x inc-by)))

(defn dec-maker [dec-by]
  (fn [x] (- x dec-by)))

;; ── Exercício 4 ──────────────────────────────────────────────────────────────
;; Escreva mapset: como map, mas retorna um set.

(defn mapset [f coll]
  (set (map f coll)))

(defn mapset-optimal [f coll]
  (into #{} (map f) coll))

;; ── Exercício 5 ──────────────────────────────────────────────────────────────
;; Versão de symmetrize-body-parts para simetria radial (5 lados).

(def asym-hobbit-body-parts
  [{:name "head"           :size 3}
   {:name "left-eye"       :size 1}
   {:name "left-ear"       :size 1}
   {:name "mouth"          :size 1}
   {:name "nose"           :size 1}
   {:name "neck"           :size 2}
   {:name "left-shoulder"  :size 3}
   {:name "left-upper-arm" :size 3}
   {:name "chest"          :size 10}
   {:name "back"           :size 10}
   {:name "left-forearm"   :size 3}
   {:name "abdomen"        :size 6}
   {:name "left-kidney"    :size 1}
   {:name "left-hand"      :size 2}
   {:name "left-knee"      :size 2}
   {:name "left-thigh"     :size 4}
   {:name "left-lower-leg" :size 3}
   {:name "left-achilles"  :size 1}
   {:name "left-foot"      :size 2}])

(defn matching-part [part side & [require-left?]]
  (when (or (not require-left?)
            (clojure.string/starts-with? (:name part) "left-"))
    {:name (clojure.string/replace (:name part) #"^left-" (str side "-"))
     :size (:size part)}))

(defn radial-symmetrize
  "Versão para alienígenas com simetria radial (5 lados)."
  [asym-body-parts]
  (reduce (fn [final-body-parts part]
            (-> final-body-parts
              (into (keep identity [part (matching-part part "up" true)]))
              (into (keep identity [(matching-part part "right" true)]))
              (into (keep identity [(matching-part part "down-left" true)]))
              (into (keep identity [(matching-part part "down-right" true)]))))
          []
          asym-body-parts))

;; ── Exercício 6 ──────────────────────────────────────────────────────────────
;; Generalize symmetrize-body-parts para N lados.

(defn generalize-symmetrize [asym-body-parts num-sides]
  ;; TODO
  )

;; ── Main ─────────────────────────────────────────────────────────────────────

(defn -main [& args]
  (println "=== Cap 03 — Do Things ===")

  (println "\n[Ex1] Funções básicas:")
  (println (str "Hello" " " "World"))
  (println (vector 1 2 3))
  (println (list 1 2 3))
  (println (hash-map :a 1 :b 2))
  (println (hash-set 1 1 2 2 3))

  (println "\n[Ex2] add-100:")
  (println (add-100 1))
  (println (add-100 50))

  (println "\n[Ex3] dec-maker:")
  (let [dec9 (dec-maker 9)]
    (println (dec9 10)))

  (println "\n[Ex4] mapset:")
  (println (mapset inc [1 1 2 2 3 3]))
  (println (mapset-optimal (inc-maker 1000) [2 2 4 4 8 8]))

  (println "\n[Ex5] radial-symmetrize:")
  (println (radial-symmetrize asym-hobbit-body-parts))
  (println (count (radial-symmetrize asym-hobbit-body-parts)) "parts")

  (println "\n[Ex6] generalize-symmetrize (2 lados):")
  (println (count (generalize-symmetrize asym-hobbit-body-parts 2)) "partes")
  (println "[Ex6] generalize-symmetrize (5 lados):")
  (println (count (generalize-symmetrize asym-hobbit-body-parts 5)) "partes"))
