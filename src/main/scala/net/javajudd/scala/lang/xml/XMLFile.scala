package net.javajudd.scala.lang.xml

import scala.xml.{Elem, Node, XML}
import scala.xml.transform.{RewriteRule, RuleTransformer}

object XMLFile extends App {

  val inputStream = this.getClass.getResourceAsStream("/50782.xml")
  val xml = XML.load(inputStream)

  val uri = (xml \ "substance-uri").text
  val rn = (xml \ "substance-uri" \ "@registry-number")
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

  val newName = <name>Judd</name>
  val newXml = new RuleTransformer(new AddChildrenTo("substance-name", newName)).transform(xml).head

  XML.save("/tmp/chem.xml", newXml)
}

class AddChildrenTo(label: String, newChild: Node) extends RewriteRule {
  override def transform(n: Node) = n match {
    case n @ Elem(_, `label`, _, _, _*) => addChild(n, newChild)
    case other => other
  }

  def addChild(n: Node, newChild: Node) = n match {
    case Elem(prefix, label, attribs, scope, child@_*) =>
      Elem(prefix, label, attribs, scope, false, child ++ newChild: _*)
    case _ => sys.error("Can only add children to elements!")
  }
}