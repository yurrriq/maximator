(defproject me.ericb/maximator "0.2.0"
  :description "Thin Clojure wrapper around MaxMind GeoIP2 for IP geolocalization"
  :url "https://github.com/yurrriq/maximator"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :repositories [["clojars" {:url "https://clojars.org/repo/"
                             :snapshots true
                             :releases true
                             :signing {:gpg-key "eric@ericb.me"}}]]
  
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.maxmind.geoip2/geoip2 "2.1.0"]
                 [gavagai "0.3.2"]]

  :plugins [[codox "0.8.10"]]
  :codox {:src-dir-uri "https://github.com/yurrriq/maximator/blob/develop/"
          :src-linenum-anchor-prefix "L"
          :defaults {:doc/format :markdown}})
