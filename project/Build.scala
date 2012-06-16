import sbt._
import Keys._

object BuildSettings {
  val buildOrganization = "com.novemberain"
  val buildScalaVersion = "2.9.2"
  val buildVersion = "0.1"

  val buildSettings = Defaults.defaultSettings ++ Seq(organization := buildOrganization,
                                                      scalaVersion := buildScalaVersion,
                                                      version := buildVersion)
}

object Resolvers {
  val typesafeRepo = "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
  val sonatypeRepo = "Sonatype Releases"   at "http://oss.sonatype.org/content/repositories/releases"

  val scalaResolvers = Seq(typesafeRepo, sonatypeRepo)
}

object Dependencies {
  val specs2Version = "1.8.2"

  val specs2 = "org.specs2" %% "specs2" % specs2Version
}

object EulerBuild extends Build {

  import Resolvers._
  import Dependencies._
  import BuildSettings._

  val commonDeps = Seq(specs2)

  lazy val euler = Project("euler", file("."), settings = buildSettings ++ Seq(resolvers := scalaResolvers,
                                                                               libraryDependencies := commonDeps))
}
