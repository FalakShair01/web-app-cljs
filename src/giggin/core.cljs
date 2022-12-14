(ns giggin.core
  (:require
   [reagent.core :as r]
   [giggin.components.header :refer [header]]
   [giggin.components.footer :refer [footer]]
   [giggin.components.gigs :refer [gigs]]
   [giggin.components.orders :refer [orders]]))

;; function app () { return <div class="container"></div>}

(defn app
  []
  
  [:div.container
   [header]
   [gigs]
   [orders]
   [footer]])

(defn ^:export main
  []
  (r/render
    [app]
    (.getElementById js/document "app")))
