import sbtrelease.ReleasePlugin.autoImport._
import sbtrelease.ReleaseStateTransformations._

name := "typesafe-api"

scalafmtOnCompile in ThisBuild := true
scalafmtTestOnCompile in ThisBuild := true

resolvers += Resolver.bintrayRepo("cakesolutions", "maven")

lazy val commonSettings = Seq(
  scalaVersion in ThisBuild := "2.12.2",
  organization in ThisBuild := "net.plsk",
  sources in (Compile, doc) := Seq.empty
)

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .settings(publish := {})
  .aggregate(q)

lazy val q = (project in file("qualify")).settings(commonSettings: _*)
