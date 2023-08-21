package net.javajudd.scala.lang.oo.companion

class Person {
  var name = ""
  override def toString: String = name
}

object Person {
  def apply(name: String): Person = {
    val p = new Person
    p.name = name
    p
  }

  val Constants = "Constant Value"
}

object Companion extends App {

  val person = Person("Chris Judd")
  println(person)

}
