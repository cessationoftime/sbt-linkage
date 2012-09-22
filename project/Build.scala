import sbt._
object MyBuild extends Build {
  override def projects = Seq(root)
  lazy val root = Project("root", file(".")) dependsOn(playTerminal)

   lazy val playTerminal = uri("git://github.com/cessationoftime/play-terminal.git")
}
