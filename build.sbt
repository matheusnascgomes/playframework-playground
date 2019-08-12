import play.ebean.sbt.PlayEbean

name := """play-scala-seed"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, PlayJava, PlayEbean)

scalaVersion := "2.11.11"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test

libraryDependencies ++= Seq(
  javaJdbc,
  javaCore,
  "org.postgresql" % "postgresql" % "9.4.1212"
)