package net.javajudd.scala.lang.oo

class A(val name: String) {
  def methodA(): Unit = println("A method")
}

class B(name: String, val description: String) extends A(name) {
  override def methodA(): Unit = println("overridden A method")
  def methodB(): Unit = println("B method")
}

object Inheritance extends App {

  val a = new A("A name")
  println(a.name)
  a.methodA()

  val b = new B("B name", "B description")
  println(b.name)
  println(b.description)
  b.methodA()
  b.methodB()
}
