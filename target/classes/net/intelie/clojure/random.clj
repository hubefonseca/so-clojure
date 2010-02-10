(ns net.intelie.clojure.random
  (:gen-class
    :state state
    :init init
    :methods [
    [rdm [] int]
    ]))

(defn -init [] [[] (atom [])])

(def rnd (new java.util.Random))

(defn -rdm [this]
  (. rnd nextInt 10))
