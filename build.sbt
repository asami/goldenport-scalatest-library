organization := "org.goldenport"

name := "scalatestlib"

version := "0.1.0"

scalaVersion := "2.9.1"

scalacOptions += "-deprecation"

scalacOptions += "-unchecked"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "6.0.3"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.6.1"

libraryDependencies += "junit" % "junit" % "4.8" % "test"

//
publishTo := Some(Resolver.file("asamioffice", file("target/maven-repository")))
