organization := "org.goldenport"

name := "goldenport-scalatest-lib"

version := "0.2.0"

scalaVersion := "2.9.2"

scalacOptions += "-deprecation"

scalacOptions += "-unchecked"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "6.0.4"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.6.1"

libraryDependencies += "junit" % "junit" % "4.8" % "test"

//
publishTo := Some(Resolver.file("asamioffice", file("target/maven-repository")))
