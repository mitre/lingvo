import sbt._

object Dependencies {

  private object Versions {
    val Enumeratum = "1.5.13"
    val ScalaLogging = "3.7.2"
    val ScalaTest = "3.0.5"
  }

  private val enumeratum = "com.beachape" %% "enumeratum" % Versions.Enumeratum
  private val enumeratumPlayJson = "com.beachape" %% "enumeratum-play-json" % Versions.Enumeratum

  private val scalatest = "org.scalatest" %% "scalatest" % Versions.ScalaTest % "test"

  lazy val `lingvo`: Seq[ModuleID] = Seq(
    enumeratum,
    enumeratumPlayJson,
    scalatest
  )
}