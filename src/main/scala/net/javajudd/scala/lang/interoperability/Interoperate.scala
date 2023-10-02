package net.javajudd.scala.lang.interoperability

import net.javajudd.java.interoperability.JavaClazz

object Interoperate extends App {

  val javaObj = new JavaClazz

  // only available in Scala 2.13+

  // Collections
//  import scala.jdk.CollectionConverters._
//  val list = List("one", "two", "three")
//  javaObj.processList(list.asJava)

  // Optional
//  import scala.jdk.OptionConverters._
//  val value = Some("Value")
//  javaObj.processOptionals(value.toJava)
}
