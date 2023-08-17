package net.javajudd.scala.lang.functions

object DefaultParameters extends App {

  log("System starting")
  log("User not found", "WARNING")

  def log(message: String, level: String = "INFO") = println(s"$level: $message")
}
