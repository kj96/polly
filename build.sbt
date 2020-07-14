name := """polly"""
organization := "com.pixie"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.0"
val elastic4sVersion = "6.3.7"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
//libraryDependencies +=
libraryDependencies ++= Seq(
  "org.webjars"     %    "html5shiv"             % "3.7.3-1",
  "org.webjars"     %    "respond"               % "1.4.2",
  "org.webjars"     %%   "webjars-play"          % "2.6.3",
  "org.webjars"     %    "Semantic-UI"           % "2.3.3",
  "org.webjars"     %    "requirejs"             % "2.2.0",
  "org.webjars.bower" %  "jqurey"                % "3.1.1",

  "com.sksamuel.elastic4s" %% "elastic4s-core" % elastic4sVersion,
  // for the http client
  "com.  " %% "elastic4s-http" % elastic4sVersion




)
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.pixie.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.pixie.binders._"
