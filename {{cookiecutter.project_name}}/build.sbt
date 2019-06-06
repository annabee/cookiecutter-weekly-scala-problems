name := "{{cookiecutter.project_name}}"

version := "0.0.1"

scalaVersion := "{{cookiecutter.scala_version}}"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)
