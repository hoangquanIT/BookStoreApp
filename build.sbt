name := """BookStoreApp"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.8"

libraryDependencies += guice

//libraryDependencies ++= Seq(
//  javaJdbc,
//  javaWs,
//  "mysql" % "mysql-connector-java" % "8.0.30",
//  "org.avaje.ebean" % "ebean" % "8.1.1" % "provided",
//  "javax.persistence" % "persistence-api" % "1.0.2"
//)