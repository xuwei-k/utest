
val scalaJSVersion = Option(System.getenv("SCALAJS_VERSION")).getOrElse("0.6.25")

addSbtPlugin("com.dwijnand"       % "sbt-dynver"                    % "2.0.0")
addSbtPlugin("com.jsuereth"       % "sbt-pgp"                       % "1.1.1")
addSbtPlugin("org.scala-js"       % "sbt-scalajs"                   % scalaJSVersion)
addSbtPlugin("org.scala-native"   % "sbt-scala-native"              % "0.3.7")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"      % "0.6.0")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "0.6.0")
