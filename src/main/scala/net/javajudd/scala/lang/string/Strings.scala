package net.javajudd.scala.lang.string

import net.javajudd.scala.lang.string.CustomInterpolator._

object Strings extends App {

  val pi: Double = 3.14159265359
  val message: String = "message"

  val interpolatedString: String = s"This is an interpolated $message with $pi"
  println(interpolatedString)

  val evaluationString: String = s"This is the result of an evaluation ${1+2}."
  println(evaluationString)

  val formattedString: String = f"PI is $pi%.3f" // String.format()
  println(formattedString)

  val rawString: String = raw"^1?([2-9]\d{2}[2-9]\d{6})$$"
  println(rawString)

  val json: String =
    """
      |{
      |  "donut_name":"Glazed Donut",
      |  "taste_level":"Very Tasty",
      |  "price":2.50
      |}""".stripMargin
  println(json)

  val sjson: String =
    s"""
      |{
      |  "message":"${message},
      |  "pi":${pi}
      |}
      |""".stripMargin
  println(sjson)

  println(cats"I love Cats")
}
