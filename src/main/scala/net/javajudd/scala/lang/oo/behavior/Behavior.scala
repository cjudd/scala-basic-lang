package net.javajudd.scala.lang.oo.behavior

class Person {
  var firstName: String = ""
  var lastName: String = ""

  def speak(): Unit = println(s"My name is ${firstName} ${lastName}")
  override def toString: String = s"${lastName}, ${firstName}"
}

object Behavior extends App {

  val person = new Person
  person.firstName = "Chris"
  person.lastName = "Judd"

  println(person)
  person.speak()

}
