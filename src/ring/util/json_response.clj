(ns ring.util.json-response
  (:require [clojure.data.json :as json]) 
  (:use ring.util.response))

(defn json-response [data]
  (-> data
    json/write-str
    response
    (content-type "application/json")))
