package net.javajudd.scala.lang.datastructs

object Seqs extends App {

  val seq = Seq(1, 2, 3)

  println(s"first element: ${seq(1)}")
  println(s"head: ${seq.head}")
  println(s"tail: ${seq.tail}")
  println(s"last: ${seq.last}")

  println(s"sum: ${seq.sum}")
  println(s"max: ${seq.max}")
  println(s"min: ${seq.min}")
  println(s"filter: ${seq.filter(_ != 3)}")
  println(s"map: ${seq.map(_ * 2)}")
  println(s"reverse: ${seq.reverse}")

}
