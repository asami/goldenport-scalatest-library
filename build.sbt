organization := "org.goldenport"

name := "goldenport-scalatest-lib"

version := "2.0.0"

scalaVersion := "2.11.6"

crossScalaVersions := Seq("2.11.6", "2.10.5")

scalacOptions += "-deprecation"

scalacOptions += "-unchecked"

incOptions := incOptions.value.withNameHashing(true)

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.1.2"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4"

libraryDependencies += "junit" % "junit" % "4.12"

//
publishTo := Some(Resolver.file("asamioffice", file("target/maven-repository")))
