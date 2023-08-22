package net.javajudd.scala.lang.types

object Ranges extends App {

  val inclusiveRange = 1 to 10
  val exclusiveRange = 1 until 10

  println("Inclusive:")
  for (i <- 1 to 10) {
    println(i)
  }

  println("Exclusive:")
  for (i <- 1 until 10) {
    println(i)
  }

}
