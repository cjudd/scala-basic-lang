package net.javajudd.scala.lang.flow

import net.javajudd.scala.lang.flow.While.x

object While extends App {

  println("While:")
  var x = 1
  while (x < 3) {
    println(x)
    x += 1
  }

  println("Do While:")
  var y = 1
  do {
    println(y)
    y += 1
  } while (y < 3)

  val t = while (x < 3) {
    println(x)
    x += 1
  }
  println(t)
}
