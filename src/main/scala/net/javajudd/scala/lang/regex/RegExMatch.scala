package net.javajudd.scala.lang.regex

object RegExMatch extends App {

    val phone = """^(\d{3})-(\d{3})-(\d{4})$""".r
    val phoneAlt = raw"^(\d{3})-(\d{3})-(\d{4})$$".r

    val number = "614-930-2800"

    val phone(area, exchange, line) = number
    println(s"area: ${area}")
    println(s"exchange: ${exchange}")
    println(s"line: ${line}")

    number match {
        case phone(area, exchange, line) => println(s"(${area})${exchange}-${line}")
        case _ => println("don't match")
    }

    number match {
        case phone(_*) => println("It's a phone number")
        case _ => println("Not a phone number")
    }
}
