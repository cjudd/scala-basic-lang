package net.javajudd.scala.lang.operators

class Person(val firstName:String, val lastName:String) {
  def +(that: Person): Couple = {
    new Couple(this, that)
  }
}

class Couple(val person1: Person, val person2: Person) {
  override def toString: String = s"${person1.firstName} and ${person2.lastName} are a happy couple."
}

object Couples extends App {
  val chris = new Person("Chris", "Judd")
  val sue = new Person("Sue", "Smith")

  val couple = chris + sue
  println(couple)
}
