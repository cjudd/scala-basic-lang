package net.javajudd.scala.lang.regex

object RegExReplace extends App {
  val phone = """(\d{3})-(\d{3})-(\d{4})""".r

  val piiLogMessage = "PII information about Chris: cjudd@manifestcorp.com, 614-930-2800, 614-930-2818"
  val cleanLogMessage = phone.replaceAllIn(piiLogMessage, "xxx-xxx-xxxx")
  println(cleanLogMessage)
}
