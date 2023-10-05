package net.javajudd.scala.lang.functions

object Literals extends App {

  def transformInt(x: Int, f: Int => Int): Int = f(x)

  val t1 = transformInt(3, x => x * 2)
  val t2 = transformInt(4, _ * 2)

  println(t1)
  println(t2)

}
