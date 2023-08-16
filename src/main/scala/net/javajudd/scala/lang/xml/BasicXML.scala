package net.javajudd.scala.lang.xml

import scala.xml.Elem

object BasicXML extends App {

  val book: Elem = <book id="b20234">Magic of scala-xml</book>

  val id = book \@ "id"
  val title = book.text
  println(
    s"""
       |id = ${id}
       |name = ${title}
       |""".stripMargin)

  val books =
    <books>
      <book id="b1615">Don Quixote</book>
      <book id="b1867">War and Peace</book>
    </books>

  val titles = (books \ "book").map(book => book.text).toList
  titles.foreach(println)

  val quixote = (books \ "book").find(book => (book \@ "id") == "b1615").map(_.text)
  println(s"b1615 title = ${quixote}")
}
