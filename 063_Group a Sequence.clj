#(reduce (fn [m e] (assoc m (% e) `[~@(m (% e)) ~e]))
  {} %2)
