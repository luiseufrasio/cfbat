(defproject cfbat "0.1.0-SNAPSHOT"
  :description "Exercícios do livro Clojure for the Brave and True"
  :url "https://www.braveclojure.com/clojure-for-the-brave-and-true/"
  :license {:name "EPL-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/core.async "1.6.681"]]
  :source-paths ["src"
                 "cap03-do-things"
                 "cap04-core-functions-in-depth"
                 "cap05-functional-programming"
                 "cap07-read-eval-macros"
                 "cap08-writing-macros"]
  :test-paths ["test"]
  :repl-options {:init-ns cfbat.core})
