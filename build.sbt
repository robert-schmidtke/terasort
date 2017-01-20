name := "terasort"

version := "0.0.1"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.0"
libraryDependencies += "org.apache.flink" %% "flink-scala" % "1.1.3"
libraryDependencies += "org.apache.flink" %% "flink-clients" % "1.1.3"

fork in run := true

