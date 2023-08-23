package net.javajudd.scala.lang.datastructs

object CollectionOperations extends App {
  val numbers = List(1,2,3,4,5,6,7,8,9,10)

  val evens = numbers.filter(_ % 2 == 0)
  println(evens)

  val double: List[Int] = numbers.map(_ * 2);
  println(double)

  val strings = numbers.map(x => s"*${x}*")
  println(strings)

  val fruits = Seq("apple", "banana", "orange")
  val upper: Seq[String] = fruits.map(_.toUpperCase)
  println(upper)

  val flatFruit: Seq[Char] = fruits.flatMap(_.toUpperCase())
  println(flatFruit)

  val lines: Seq[String] =
    """The quick brown fox jumps over the lazy dog.
      |He lands head first on a rotting maple log.
      |Knocked unconscious, fox sleeps with shallow breath
      |until the lazy dog awakes.""".stripMargin.split("\n").toSeq

  var mapped: Seq[Array[String]] = lines.map(_.split("""\W+"""))
  println(mapped)
  val words: Seq[String] = lines.flatMap(_.split("""\W+"""))
  println(words)

  val bigWords: Seq[String] = lines.flatMap(_.split("""\W+""")).filter(_.length > 4)
  println(bigWords)
}
