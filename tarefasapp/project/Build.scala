import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "tarefasapp"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
     "org.hibernate" % "hibernate-entitymanager" % "4.0.1.Final",
     "org.jadira.usertype" % "usertype.spi" % "3.0.0.CR4",
     "org.joda" % "joda-money" % "0.6",
     "org.slf4j" % "slf4j-api" % "1.6.4",
     "joda-time" % "joda-time" % "2.0",
     "org.hibernate" % "hibernate-core" % "4.0.1.Final",
     "org.jadira.cdt" % "cdt" % "3.0.0.CR4"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    )

}
