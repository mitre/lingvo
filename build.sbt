val username = "mitre"
val repo = "lingvo"

lazy val `common-settings` = Seq(
  name := "lingvo",
  organization := "org.mitre",
  scalaVersion := "2.12.5",
  startYear := Some(2018),
  licenses += ("Apache-2.0", new URL("https://www.apache.org/licenses/LICENSE-2.0.txt")),
  headerLicense := Some(HeaderLicense.Custom("Copyright (c) 2018 The MITRE Corporation. All rights reserved.")),
  excludeFilter.in(headerSources) := HiddenFileFilter || "*.sbt",
  excludeFilter.in(headerResources) := HiddenFileFilter || "*.xml",
  homepage := Some(url(s"https://github.com/$username/$repo")),
  scmInfo := Some(ScmInfo(url(s"https://github.com/$username/$repo"), s"git@github.com:$username/$repo.git")),
  apiURL := Some(url(s"https://$username.github.io/$repo/latest/api/")),
  releaseCrossBuild := true,
  releasePublishArtifactsAction := PgpKeys.publishSigned.value,
  developers := List(
    Developer(
      id = "erip",
      name = "Elijah Rippeth",
      email = "erippeth@mitre.org",
      url = new URL(s"http://github.com/erip")
    )
  ),
  useGpg := true,
  usePgpKeyHex("50D253D19C642F49"),
  publishMavenStyle := true,
  credentials ++= (for {
    username <- sys.env.get("SONATYPE_USERNAME")
    password <- sys.env.get("SONATYPE_PASSWORD")
  } yield Credentials("Sonatype Nexus Repository Manager", "oss.sonatype.org", username, password)).toSeq,
  publishArtifact in Test := false,
  publishTo := Some(if (isSnapshot.value) Opts.resolver.sonatypeSnapshots else Opts.resolver.sonatypeStaging),
  // Following 2 lines need to get around https://github.com/sbt/sbt/issues/4275
  publishConfiguration := publishConfiguration.value.withOverwrite(true),
  publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true)
)

lazy val lingvo = (project in file("."))
  .settings(`common-settings`: _*)
  .settings(
    libraryDependencies ++= Dependencies.`lingvo`
  )
  .enablePlugins(AutomateHeaderPlugin)

