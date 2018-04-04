import sbt._

object Dependencies {

  private object Versions {
    val Enumeratum = "1.5.12"
    val EnumeratumPlayJson = "1.5.12-2.6.0-M7"

    val ScalaLogging = "3.7.2"
    val ScalaTest = "3.0.4"
  }

  private val enumeratum = "com.beachape" %% "enumeratum" % Versions.Enumeratum
  private val enumeratumPlayJson = "com.beachape" %% "enumeratum-play-json" % Versions.EnumeratumPlayJson

  lazy val `lingvo`: Seq[ModuleID] = Seq(
    enumeratum,
    enumeratumPlayJson
  )

}