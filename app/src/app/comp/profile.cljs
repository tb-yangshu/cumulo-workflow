
(ns app.comp.profile
  (:require [hsl.core :refer [hsl]]
            [app.schema :as schema]
            [respo-ui.core :as ui]
            [respo-ui.colors :as colors]
            [respo.macros :refer [defcomp <> span div a]]
            [respo.comp.space :refer [=<]]))

(defn on-log-out [e dispatch!]
  (dispatch! :user/log-out nil)
  (.removeItem js/localStorage (:storage-key schema/configs)))

(def style-trigger
  {:font-size 14,
   :cursor :pointer,
   :background-color colors/motif-light,
   :color :white,
   :padding "0 8px"})

(defcomp
 comp-profile
 (user)
 (div
  {:style (merge ui/flex {:padding 16})}
  (<> span (str "Hello! " (:name user)) nil)
  (=< 8 nil)
  (a {:style style-trigger, :on-click on-log-out} (<> span "Log out" nil))))
