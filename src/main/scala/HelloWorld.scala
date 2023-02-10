import com.sun.tools.javac.Main

import scala.annotation.tailrec

object HelloWorld extends App {
  ("Hello" +####+ " " +####+ "World").printme()

  implicit class StringWrapper(s: String) {
    def printme(): Unit = {
      println(s)
    }

    def +####+(s: String): String = {
      s + s
    }
  }
}