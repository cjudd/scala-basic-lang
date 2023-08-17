package net.javajudd.scala.lang.datastructs

import scala.collection.mutable.ListBuffer

object ListBuffers extends App {

  //val list: ListBuffer[Int] = scala.collection.mutable.ListBuffer()
  //val list = scala.collection.mutable.ListBuffer.empty[Int]
  val list = scala.collection.mutable.ListBuffer[Int]()
  list += 1
  list += (2, 3, 4)
  list += 10

  list -= 3

  println(list)

}
