package net.javajudd.scala.lang.string

object Strings extends App {

  val pi: Double = 3.14159265359
  val message: String = "message"

  val interpolatedString: String = s"This is an interpolated $message with $pi"
  println(interpolatedString)

  val evaluationString: String = s"This is the result of an evaluation ${1+2}."
  println(evaluationString)

  val formattedString: String = f"PI is $pi%.3f" // String.format()
  println(formattedString)

  val rawString: String = raw"PI is $pi%.3f"
  println(rawString)

}
