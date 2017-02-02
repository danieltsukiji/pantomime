(defproject com.novemberain/pantomime "2.9.0"
  :min-lein-version "2.5.1"
  :description "A minimalistic Clojure interface to Apache Tika"
  :url "http://github.com/michaelklishin/pantomime"
  :license { :name "Eclipse Public License" }
  :source-paths ["src/clojure"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.apache.tika/tika-parsers "1.14"]]
  :profiles {:dev {:resource-paths ["test/resources"]
                   :dependencies [[clj-http "3.4.1"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :master {:dependencies [[org.clojure/clojure "1.9.0-master-SNAPSHOT"]]}}
  :repositories {"sonatype" {:url "http://oss.sonatype.org/content/repositories/releases"
                             :snapshots false
                             :releases {:checksum :fail :update :always}}
                 "sonatype-snapshots" {:url "http://oss.sonatype.org/content/repositories/snapshots"
                                       :snapshots true
                                       :releases {:checksum :fail :update :always}}}
  :aliases  {"all" ["with-profile" "+dev:+1.7:+master"]}
  :global-vars {*warn-on-reflection* true})
