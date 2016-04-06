name := "terasort"

version := "0.0.1"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.0"
libraryDependencies += "org.apache.flink" % "flink-scala" % "0.10.2"
libraryDependencies += "org.apache.flink" % "flink-clients" % "0.10.2"

fork in run := true

