http://clojuredocs.org

(println "hello world")

; strings
"hello world"
; numbers
31337
; symbols
this-is-a-symbol
; keywords
:this-is-a-keyword

Lists (space separates elements) LinkedList
(println "hello world")
(1 2 3 "hello" :world)
(1 2 3 ("list within list"))

Vector - ArrayList
["This" :is "a vector" 1 2 3]

Functions
(defn hello-world []
	(println "hello world"))
(defn add-two [a b]
	(+ a b))

(defn number-as-text [number]
	(cond (= number 1) "One"
				(= number 2) "Two"
				:else					"Many"))


Unit test
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


(fn [num] (+ num 2))

(def pluss2 (fn [num] (+ num 2)))


(map inc [1 2 3])
(map (fn [i] (+ i 2)) [1 2 3])

(filter (pos? [-1 0 -2]))


(count (filter (fn [num] (= num digit)) dices)
      )