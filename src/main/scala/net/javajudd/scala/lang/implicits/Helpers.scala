package net.javajudd.scala.lang.implicits

import scala.annotation.tailrec
import scala.language.implicitConversions

object Helpers {

  class HelperIntWrapper(val x: Int) {

    def times[A](f: => A): Unit = {
      @tailrec
      def loop(current: Int): Unit =
        if (current > 0) {
          f
          loop(current - 1)
        }

      loop(x)
    }

    def double(): Int = x * 2
  }

  implicit def helperIntWrapper(value: Int): HelperIntWrapper = new HelperIntWrapper(value)
}