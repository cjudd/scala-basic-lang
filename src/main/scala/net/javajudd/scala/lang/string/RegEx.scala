package net.javajudd.scala.lang.string

object RegEx extends App {
  val theUltimateAnswer: String = "To life, the universe, and everything is 42."
  val pattern = """.* ([\d]+).*""".r
  val pattern(answerString) = theUltimateAnswer

   val answer = answerString.toInt
  println(answer)
}
