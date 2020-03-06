(ns verifier-mock.service
  (:require [io.pedestal.http :as http]
            [io.pedestal.http.route :as route]
            [io.pedestal.interceptor.chain :as chain]
            [outpace.config :refer [defconfig]]
            [cheshire.core :as json]))

(defconfig host "0.0.0.0")
(defconfig port "8000")
(defconfig user-id "uid-12345")
(defconfig email "test@makimo.pl")
(defconfig nickname "Makimo Test User")
(defconfig profile-photo "https://fillmurray.com/300/300")

(defn success
  [_]
  {:status 200
   :headers {"Content-Type" "application/json"}
   :body (json/encode {:id user-id
                       :email email
                       :nickname nickname
                       :profile_photo profile-photo})})

(defn failure
  [_]
  {:status 401})

(def routes
  (route/expand-routes
    #{["/success" :get success :route-name :success]
      ["/failure" :get failure :route-name :failure]}))

(def service {:env :prod
              ::http/routes routes
              ::http/host host
              ::http/port (Integer/parseInt port)
              ::http/allowed-origins (constantly true)
              ::http/type :jetty})
