package net.javajudd.scala.lang.datastructs

object Lists extends App {

  println("** MCU Characters **")
  val mcuHeros = List("Hulk", "Groot", "Gamora", "Black Panther")

  println(s"first element: ${mcuHeros(1)}")
  println(s"head: ${mcuHeros.head}")
  println(s"tail: ${mcuHeros.tail}")
  println(s"last: ${mcuHeros.last}")

  println("For Loop:")
  for(hero <- mcuHeros) {println(hero)}

  println("Foreach:")
  mcuHeros.foreach(println)

  println("** Numbers **")
  val numberList = List(1, 2, 3, 4, 5)
  val numberListAlt1: List[Int] = List(1, 2, 3, 4, 5)
  val numberListAlt2 = 1 :: 2 :: 3 :: 4 :: Nil

  // head :: tail
  val x :: xs = numberList
  println(s"Head: ${x} & Tail: ${xs}")

  val total = numberList.reduce((x, y) => x + y)
  println(s"total: ${total}")
  println(s"sum: ${numberList.sum}")
  println(s"max: ${numberList.max}")
  println(s"min: ${numberList.min}")
  println(s"filter: ${numberList.filter(_ != 3)}")
  println(s"map: ${numberList.map(_ * 2)}")
  println(s"reverse: ${numberList.reverse}")

  val combinedList = mcuHeros ::: numberList
  println(s"Combined Lists: ${combinedList}")
}
