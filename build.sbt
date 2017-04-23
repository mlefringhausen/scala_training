organization := "de.heikoseeberger"
name         := "scala-train"
version      := "0.0.1"
initialCommands := "import de.heikoseeberger.scalatrain._"


scalaVersion   := "2.11.8"
scalacOptions ++= List(
  "-unchecked",
  "-deprecation",
  "-target:jvm-1.8"
)

libraryDependencies ++= List(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)



