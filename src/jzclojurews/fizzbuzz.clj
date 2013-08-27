(ns fizzbuzz
  (:use clojure.test))

(with-test
  (defn fizzbuzz [number]
    (cond (= (rem number 15) 0) "fizzbuzz "
          (= (rem number 3) 0) "fizz "
  				(= (rem number 5) 0) "buzz "
  				:else					number))
  (is (= 1 (fizzbuzz 1)))
  (is (= "fizz " (fizzbuzz 3)))
  (is (= "buzz " (fizzbuzz 5)))
)

(defn one-hundred []
  (take 100 (iterate inc 1)))

(defn fizzbuzzes []
  (map fizzbuzz (one-hundred)))
