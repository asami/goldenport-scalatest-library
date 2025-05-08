organization := "org.goldenport"

name := "goldenport-scalatest-lib"

version := "2.1.1"

scalaVersion := "2.12.13"

// crossScalaVersions := Seq("2.11.6", "2.10.5")

scalacOptions += "-deprecation"

scalacOptions += "-unchecked"

incOptions := incOptions.value.withNameHashing(true)

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.26"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"

libraryDependencies += "junit" % "junit" % "4.12"

//
val mavenrepo = settingKey[String]("mavenrepo")

mavenrepo := sys.env.getOrElse("PUBLISH_MAVEN_REPO", default = "target/maven-repository")

publishTo <<= mavenrepo { v: String =>
  Some(Resolver.file("file", file(v)))
}
