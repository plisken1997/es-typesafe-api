
object SharedDependencies extends DependenciesVersions {

  import sbt._

  val resolvers = Seq(
    Resolver.jcenterRepo,
    Resolver.bintrayRepo("cakesolutions", "maven")
  )

  val logback = "ch.qos.logback" % "logback-classic" % logbackVersion
  val log4j = "org.slf4j" % "slf4j-api" % log4jVersion
  val typesafeConfig = "com.typesafe" % "config" % typesafeConfigVersion
  val javaxInject = "javax.inject" % "javax.inject" % javaxInjectVersion

  val scalatest: Seq[ModuleID] = Seq(
    "org.scalactic" %% "scalactic" % scalacticVersion % Compile,
    "org.scalatest" %% "scalatest" % scalatestVersion
  )
  val scalacheck: Seq[ModuleID] = Seq(
    "org.scalacheck" %% "scalacheck" % scalacheckVersion
  )

  val pureconfig = Seq(
    "com.github.pureconfig" %% "pureconfig" % pureconfigVersion
  )
}

trait DependenciesVersions {
  val logbackVersion = "1.1.3"
  val log4jVersion = "1.7.25"
  val typesafeConfigVersion = "1.2.1"
  val javaxInjectVersion = "1"
  val scalacticVersion = "3.0.4"
  val scalatestVersion = "3.0.4"
  val scalacheckVersion = "1.13.4"
  val pureconfigVersion = "0.9.1"
}
