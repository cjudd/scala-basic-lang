package net.javajudd.scala.lang.oo.constructors

class Person(val firstName: String, val lastName: String) {
  def speak(): Unit = println(s"My name is ${firstName} ${lastName}")
  override def toString: String = s"${lastName}, ${firstName}"
}

object Constructors extends App {
  val person = new Person("Chris", "Judd")

  println(person)
  person.speak()
}
