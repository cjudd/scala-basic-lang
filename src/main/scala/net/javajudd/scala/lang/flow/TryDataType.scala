package net.javajudd.scala.lang.flow

import scala.util.{Try, Failure, Success}

object TryDataType extends App {

  val result = sum(1, Int.MaxValue)
  result match {
    case Failure(e) => println(s"Failed math with ${e.getMessage}")
    case Success(r) => println(s"result is ${r}")
  }

  def sum(a: Int, b: Int): Try[Int] = Try {
      Math.addExact(a,b)
  }

}
