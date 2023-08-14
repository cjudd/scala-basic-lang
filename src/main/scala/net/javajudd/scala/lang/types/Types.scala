package net.javajudd.scala.lang.types

object Types extends App {

  val list: List[Any] = List(
    "a string",
    732,
    12.34,
    12.34f,
    'c',
    '☺', //\u263a
    true,
    (1, 2),
    "Pitt" -> 59,
    1 to 10,
    this,
    Unit,
    (),
    () => "an anonymous function returning a string"
  )

  list.foreach(e => println(s"$e - ${e.getClass} - ${e.getClass.getSuperclass}"))
}
