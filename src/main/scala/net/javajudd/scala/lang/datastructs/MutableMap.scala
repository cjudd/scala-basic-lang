package net.javajudd.scala.lang.datastructs

object MutableMap extends App {

  val states = scala.collection.mutable.Map[String, String]()
  states("OH") = "Ohio"
  states += ("TX" -> "Texas")
  states += ("NY" -> "New York", "CA" -> "California")

  println(s"states: ${states}")

  states -= ("TX", "NY")
  println(s"states: ${states}")
}
