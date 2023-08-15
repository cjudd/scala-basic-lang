package net.javajudd.scala.lang.types

object Functions extends App {
  def double(i: Int): Int = i * 2
  def triple(i: Int): Int = { i * 3 }

  println(double(1))
  println(triple(1))
}
