package net.javajudd.scala.lang.tuple

object Tuples extends App {

  val tuple: (String, Int) = ("Judd", 50)

  println(s"Tuple - ${tuple}")
  println(s"First Value ${tuple._1} and Second Value ${tuple._2}")
  println(s"Swap - ${tuple.swap}")

  println("Iterate:")
  tuple.productIterator.foreach(println)

  val(name, age) = tuple
  println(s"First Value ${name} and Second Value ${age}")

  val tuple1: (String, Int, Boolean) = ("Smith", 31, true)
  val tuple2 = "Pitt" -> 59
}
