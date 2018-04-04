lazy val `common-settings` = Seq(
  name := "lingvo",
  organization := "org.mitre",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.12.5"
)

lazy val lingvo = (project in file("."))
  .settings(`common-settings`: _*)
  .settings(
    libraryDependencies ++= Dependencies.`lingvo`
  )

