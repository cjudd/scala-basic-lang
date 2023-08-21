package net.javajudd.scala.lang.oo.cases

case class Person(name: String, age: Int)

object CaseClasses extends App {

  val chris = Person("Chris Judd", 50)
  println(chris)

  val anotherChris = Person("Chris Judd", 50)

  println(chris == anotherChris)

  val olderChris = chris.copy(age = 51)
  println(olderChris)
}
