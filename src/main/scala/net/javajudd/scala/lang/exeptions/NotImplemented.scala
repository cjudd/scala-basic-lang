package net.javajudd.scala.lang.exeptions

object NotImplemented extends App {
  private def doSomething(s: String): Int = ???

  doSomething("Something")
}
