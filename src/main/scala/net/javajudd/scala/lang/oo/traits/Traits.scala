package net.javajudd.scala.lang.oo.traits

trait Employee {
  val hours: Int = 40
  def work(): Unit
  def sleep(): Unit = println("Sleeping...")
}

class Person extends Employee {
  override def work(): Unit = println("Working...")
}

object Traits extends App {

  val person = new Person
  person.work()
  person.sleep()
  println(person.hours)

}
