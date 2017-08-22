name := "terasort"

version := "0.0.1"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.0"
libraryDependencies += "org.apache.flink" %% "flink-scala" % "1.3.2"
libraryDependencies += "org.apache.flink" %% "flink-clients" % "1.3.2"

fork in run := true

