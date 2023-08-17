package net.javajudd.scala.lang.functions

object NamedParameters extends App {

  printName("Chris", "Judd")
  printName(first = "Chris", last = "Judd")
  printName(last = "Judd", first = "Chris")

  def printName(first: String, last: String): Unit = println(s"${first} ${last}")

}
