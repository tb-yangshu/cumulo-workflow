
(ns server.schema )

(def configs {:storage-key "/data/cumulo/workflow-storage.edn", :port 5021})

(def database {:sessions {}, :users {}, :count 0})

(def notification {:id nil, :kind nil, :text nil})

(def router {:name nil, :title nil, :data {}, :router nil})

(def session
  {:user-id nil,
   :id nil,
   :nickname nil,
   :router {:name :home, :data nil, :router nil},
   :notifications []})

(def user {:name nil, :id nil, :nickname nil, :avatar nil, :password nil})
