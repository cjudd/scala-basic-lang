package net.javajudd.scala.lang.xml

import scala.xml.XML
import java.io.InputStream

object XMLFile extends App {

  val inputStream : InputStream = this.getClass.getResourceAsStream("/50782.xml")
  val xml = XML.load(inputStream)

  val uri = (xml \ "substance-uri").text
  val rn = (xml \ "substance-uri" \ "@registry-number").text
  val diplayName = (xml \ "display-name").text
  val formula = (xml \ "molecular-formula" \ "formula").text
  val synonyms = (xml \ "substance-name" \ "name").map(x => x.text).toSet.mkString("; ")

  println(
    s"""
       |uri = ${uri}
       |rn = ${rn}
       |display name = ${diplayName}
       |formula = ${formula}
       |synonyms = ${synonyms}
       |""".stripMargin
  )

  println("Names:")
  for {
    name <- xml \\ "name"
  } {
    println(s"\t${name.text}")
  }

}
