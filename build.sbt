name := """h2_test"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  javaJdbc,
  javaEbean,
  cache,
  "org.scalatestplus" %% "play" % "1.1.0" % "test"
)
