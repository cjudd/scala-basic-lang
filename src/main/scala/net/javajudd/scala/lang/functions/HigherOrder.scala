package net.javajudd.scala.lang.functions

object HigherOrder extends App {

  def squareIt(x: Int): Int = { x * x }
  def cubeIt(x: Int): Int = { x * x * x }

  def transformInt(x: Int, f: Int => Int): Int = {
    f(x)
  }

  val st = transformInt(2, squareIt)
  println(st)

  val ct = transformInt(2, cubeIt)
  println(ct)
}
