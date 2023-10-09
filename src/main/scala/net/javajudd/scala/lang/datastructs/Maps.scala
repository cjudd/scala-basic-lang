package net.javajudd.scala.lang.datastructs

import scala.util.Try

object Maps extends App {

  val map1: Map[Int, String] = Map(1 -> "1st", 2 -> "2nd")
  val map2 = List(3 -> "3rd", 4 -> "4th").toMap

  val map = Map(1 -> "one", 2 -> "two", 3 -> "three", 4 -> "four", 5 -> "five")

  println(s"get 1: ${map(1)}")
  // println(s"get 1: ${map(10)}") // NoSuchElementException
  println(s"get 2: ${map.get(2)}")
  println(s"get 2: ${map.get(10)}")
  println(s"does map contain 3: ${map.contains(3)}")

  println(s"3: ${Try(map(3)) getOrElse "Unknown"}")
  println(s"10: ${Try(map(10)) getOrElse "Unknown"}")

  println(s"3: ${map.getOrElse(3,"Unknown")}")
  println(s"10: ${map.getOrElse(10,"Unknown")}")

  val addToMap = map + (6 -> "six", 7 -> "seven")
  println(s"added to map = ${addToMap}")

  val removeFromMap = addToMap - 6
  println(s"removed from map: ${removeFromMap}")

  val modifiedMap = map + (1 -> "uno")
  println(s"modified map ${modifiedMap}")

  val mergedMap = map1 ++ map2
  println(s"merged map ${mergedMap}")
}
