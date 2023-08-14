package net.javajudd.scala.lang

object PhoneNumber {
  val VALID_PHONE_NUMBER = raw"^1?([2-9]\d{2}[2-9]\d{6})$$".r

  def main(args: Array[String]): Unit = {
    println(clean("6149302800"))
    println(clean("614-930-2800"))
    println(clean("614930280000"))
    println(clean("614"))
  }

  def clean(input: String): Option[String] = {
    val cleaned = input.filter(_.isDigit)
    Option(cleaned) collect { case VALID_PHONE_NUMBER(cleaned) => cleaned }
  }
}
