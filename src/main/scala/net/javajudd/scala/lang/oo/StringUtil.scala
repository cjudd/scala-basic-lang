package net.javajudd.scala.lang.oo

object StringUtil {

  def reverse(string: String): String = string.reverse

  def lowercase(string: String): String = string.toLowerCase

  def main(args: Array[String]): Unit = {
    println(StringUtil.reverse("message"))
    println(StringUtil.lowercase("MeSsAgE"))
  }

}
