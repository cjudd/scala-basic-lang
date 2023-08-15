package net.javajudd.scala.lang.flow

object Fors extends App {

  for (i <- List(1, 2, 3)) println(i)

  val ints = List(1, 2, 3, 4, 5)
  for (i <- ints) {
    println(i)
  }

  for(i <- ints if i > 2) { // guards
    println(i)
  }

  for {
    i <- 1 to 3
    j <- 'a' to 'f'
  } {
    println(s"${i}, ${j}")
  }

  // expression
  val doubles = for (i <- ints) yield (i * 2)
  println(doubles)
}
