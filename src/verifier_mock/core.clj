(ns verifier-mock.core
  (:gen-class)
  (:require [io.pedestal.http :as http]
            [verifier-mock.service :as service]))

(defn -main
  [& args]
  (-> service/service
      (http/default-interceptors)
      (http/create-server)
      (http/start)))
