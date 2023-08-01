package net.javajudd.scala.lang.variables

object Variables extends App {

  // Immutable variable
  val x = 1
  //x = 2;  // Reassignment to val
  println("Immutable variable x: " + x)

  // Mutable variable
  var y = 1;
  y = 2;
  println("Muttable variable y: " + y)
}
