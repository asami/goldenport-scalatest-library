organization := "org.goldenport"

name := "goldenport-scalatest-lib"

version := "1.0.0"

scalaVersion := "2.10.3"
// crossScalaVersions := Seq("2.9.2", "2.9.1")

scalacOptions += "-deprecation"

scalacOptions += "-unchecked"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.0.5"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0"

libraryDependencies += "junit" % "junit" % "4.8" % "test"

//
publishTo := Some(Resolver.file("asamioffice", file("target/maven-repository")))
