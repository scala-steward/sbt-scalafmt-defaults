sys.props.get("plugin.version") match {
  case Some(x) => addSbtPlugin("com.alejandrohdezma" % "sbt-scalafmt-defaults" % x)
  case _       => sys.error("https://www.scala-sbt.org/1.x/docs/Testing-sbt-plugins.html")
}
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.3.4")
