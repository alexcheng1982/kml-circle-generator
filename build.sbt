name := """kml-circle"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SbtWeb)

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  guice
)

