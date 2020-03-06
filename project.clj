(defproject verifier-mock "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [com.outpace/config "0.13.2"]
                 [io.pedestal/pedestal.service "0.5.7"]
                 [io.pedestal/pedestal.route "0.5.7"]
                 [io.pedestal/pedestal.jetty "0.5.7"]
                 [cheshire "5.10.0"]
                 [org.slf4j/slf4j-simple "1.7.28"]]
  :main ^:skip-aot verifier-mock.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
