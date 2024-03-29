import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "Covoiturage"
    val appVersion      = "1.0.1-SNAPSHOT"

    val appDependencies = Seq(
      "postgresql" % "postgresql" % "9.1-901-1.jdbc4"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    )

}
