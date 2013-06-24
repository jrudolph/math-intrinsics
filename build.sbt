resolvers += "spray repo" at "http://repo.spray.io/"

libraryDependencies ++= Seq(
  "io.spray" % "spray-client" % "1.1-M7"
)

scalaVersion := "2.10.1"

fork in run := true

javaOptions ++= Seq(
  "-XX:+UnlockDiagnosticVMOptions",
  "-XX:+PrintAssembly"
)
