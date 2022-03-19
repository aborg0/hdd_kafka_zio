ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.github.aborg0"
ThisBuild / organizationName := "hdd_kafka_zio"

lazy val root = (project in file("."))
  .settings(
    name := "hdd_kafka_zio",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "2.0.0-RC3",
      "dev.zio" %% "zio-test" % "2.0.0-RC3" % Test
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
