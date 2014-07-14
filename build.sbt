libraryDependencies ++= (
  ("com.github.xuwei-k" %% "play23scalaz70" % "0.1.4") ::
  ("com.chuusai" %% "shapeless" % "2.0.0") ::
//  ("org.typelevel" %% "shapeless-scalaz" % "0.2") :: // TODO for Scala 2.11
  Nil
)

name := "play2-json-twenty-three"

licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))

scalaVersion := "2.11.1"

resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/releases/"

scalacOptions ++= (
  "-language:postfixOps" ::
  "-language:implicitConversions" ::
  "-language:higherKinds" ::
  "-language:existentials" ::
  "-deprecation" ::
  "-unchecked" ::
  "-Ywarn-unused" ::
  "-Ywarn-unused-import" ::
  "-Xlint" ::
  Nil
)
