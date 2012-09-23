package sbtlinkage

import sbt._
import Keys._

object Link extends App {
  val console = new _root_.console.Console(this.getClass.getClassLoader);
  console.systemInstall();
}
object SbtLinkage extends Plugin {
  override lazy val settings = Seq(commands += myCommand)

  // object LinkageKeys {
  // val linkagePort = SettingKey[String]("linkage-port", "set linkage port, default is random")
  // val linkageAutolaunch = SettingKey[String]("linkage-autolaunch", "set linkage autolaunch on sbt startup")
  // val linkage = TaskKey[Unit]("linkage", "launch sbt in the default web browser uing play-terminal")

  //}
  //import LinkageKeys._

  lazy val console = new _root_.console.Console(this.getClass.getClassLoader);

  lazy val myCommand =
    Command.command("linkage") { (state: State) =>
      console.systemInstall();
      state
    }
}
