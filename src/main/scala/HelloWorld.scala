import com.sun.tools.javac.Main

import scala.annotation.tailrec

object HelloWorld extends App {
  println("Hello again, World!")

  val myList = Seq(1, 5, 7, 5, 2);

//  (Int, X) => R
//       (X) => R
  val halfFold: ((Int, Int) => Int) => Int =
    myList.foldLeft(myList.head)(_)

  println(halfFold((acc, x) => {
    if (x > acc) x else acc
  }))
}