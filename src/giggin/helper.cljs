(ns giggin.helper)

(defn format-price [cents]
  (str "$" (/ cents 100)))