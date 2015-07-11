name := "sedis"

organization := "org.sedis"

version := "1.2.1-SNAPSHOT"

scalaVersion := "2.10.4"

scalacOptions += "-target:jvm-1.7"

// for later:
//initialize := {
//  val required = "1.8"
//  val current  = sys.props("java.specification.version")
//  assert(current == required, s"Unsupported JDK: java.specification.version $current != $required")
//}

libraryDependencies += "redis.clients" % "jedis" % "2.5.1"

libraryDependencies += "org.apache.commons" % "commons-pool2" % "2.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"
