package net.javajudd.scala.lang.options

object Options extends App {

  val a: Option[Int] = Some(5)
  val b: Option[Int] = None

  println(s"a.getOrElse(0): ${a.getOrElse(0)}")
  println(s"a.isDefined: ${a.isDefined}")
  println(s"a.isEmpty: ${a.isEmpty}")
  println(s"a.nonEmpty: ${a.nonEmpty}")
  println(s"a.get: ${a.get}")

  val va = a match {
    case Some(n) => n
    case None => 0
  }

  a.foreach(println)

  println(s"b.getOrElse(10): ${b.getOrElse(10)}")
  println(s"a.isDefined: ${b.isDefined}")
  println(s"b.isEmpty: ${b.isEmpty}")
  println(s"b.nonEmpty: ${b.nonEmpty}")
  // println(s"b.get: ${b.get}") // NoSuchElementException
  b.foreach(println)
}
