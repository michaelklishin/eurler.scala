name := "euler"

organization := "com.novemberain"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq("org.scala-tools.testing" % "specs_2.9.1" % "1.6.9" % "test")



resolvers ++= Seq("Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
                  "Sonatype OSS Releases"  at "https://oss.sonatype.org/content/repositories/releases",
                  "Concurrent Maven Repo"  at "http://conjars.org/repo")
