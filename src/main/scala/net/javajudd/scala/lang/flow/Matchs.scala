package net.javajudd.scala.lang.flow

object Matchs extends App {
  val i = 1
  i match {
    case 1 => println("one")
    case 2 => println("two")
    case _ => println("other")
  }

  // expression
  val j = 1
  val result = j match {
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
  }
  println(result)

  def getClassAsString(x: Any): String = x match {
    case s: String => s"'$s' is a String"
    case i: Int => "Int"
    case d: Double => "Double"
    case l: List[_] => "List"
    case _ => "Unknown"
  }

  println(getClassAsString(1))
  println(getClassAsString("hello"))
  println(getClassAsString(List(1, 2, 3)))

  // not limited to integer values
  val h = Hero("Groot")
  h match {
    case Hero(name) if name == "Groot" =>
      println(s"$name says, I am Groot")

    case Hero(name) if name == "Hulk" =>
      println(s"$name says, Puny god")

    case _ => println("Watch MCU!")
  }
}

case class Hero(name: String)
