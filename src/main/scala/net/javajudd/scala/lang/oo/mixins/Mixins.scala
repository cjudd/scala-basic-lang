package net.javajudd.scala.lang.oo.mixins

trait Employee {
  def work(): Unit
  def sleep(): Unit = println("Sleeping...")
}

trait Musician {
  def play(): Unit = println("Playing...")
}

class Person extends Employee with Musician {
  override def work(): Unit = println("Working...")
}

class Dog

object Mixins extends App {
  val person = new Person
  person.work()
  person.play()

  val spot = new Dog with Musician
  spot.play()
}
