package net.javajudd.scala.lang.flow

import java.time.LocalTime

object IfElse extends App {

  val x = 0
  if (x < 0) {
    println("negative")
  } else if (x == 0) {
    println("zero")
  } else {
    println("positive")
  }

  val second = LocalTime.now.getSecond
  // expression
  val displayFlag = if (second % 2 == 0) "Second is Even" else "Second is Odd"
  println(displayFlag)
}