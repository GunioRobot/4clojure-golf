(fn [s]
  (reduce #(str % \, %2)
	  (filter (fn [n]
		    (some #(= (* % %) n) (range n)))
		  (read-string (str \[ s \])))))
