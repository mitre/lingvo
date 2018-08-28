lazy val `common-settings` = Seq(
  name := "lingvo",
  organization := "org.mitre",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.12.5",
  startYear := Some(2018),
  licenses += ("Apache-2.0", new URL("https://www.apache.org/licenses/LICENSE-2.0.txt")),
  headerLicense := Some(HeaderLicense.Custom("Copyright (c) 2018 The MITRE Corporation. All rights reserved.")),
  excludeFilter.in(headerSources) := HiddenFileFilter || "*.sbt",
  excludeFilter.in(headerResources) := HiddenFileFilter || "*.xml"
)

lazy val lingvo = (project in file("."))
  .settings(`common-settings`: _*)
  .settings(
    libraryDependencies ++= Dependencies.`lingvo`
  )
  .enablePlugins(AutomateHeaderPlugin)

