package net.javajudd.scala.lang.flow

object TryCatchExpression extends App {

  val v = try {
    Math.addExact(1, Int.MaxValue)
  } catch {
    case e: ArithmeticException => -1
  }
  println(v)

}
