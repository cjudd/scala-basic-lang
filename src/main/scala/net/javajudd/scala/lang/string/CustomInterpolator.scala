package net.javajudd.scala.lang.string


object CustomInterpolator extends App {
  implicit class CatInterpolator(val sc: StringContext) extends AnyVal {
    def cats(args: Any*): String = {
      val stringContextIterator = sc.parts.iterator
      val argsIterator = args.iterator

      val sb = new java.lang.StringBuilder(stringContextIterator.next())

      while (argsIterator.hasNext) {
        sb.append(argsIterator.next().toString)
        sb.append(stringContextIterator.next())
      }
      s"🐱🐱🐱 ${sb.toString} 🐱🐱🐱"
    }
  }
}



