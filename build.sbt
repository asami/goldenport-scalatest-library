organization := "org.goldenport"

name := "goldenport-scalatest-lib"

version := "2.1.0"

scalaVersion := "2.12.7"

// crossScalaVersions := Seq("2.11.6", "2.10.5")

scalacOptions += "-deprecation"

scalacOptions += "-unchecked"

incOptions := incOptions.value.withNameHashing(true)

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.26"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"

libraryDependencies += "junit" % "junit" % "4.12"

//
publishTo := Some(Resolver.file("asamioffice", file("target/maven-repository")))
