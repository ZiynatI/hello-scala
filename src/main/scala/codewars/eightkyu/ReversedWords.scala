package codewars.eightkyu

object ReversedWords {
  def main(args: Array[String]): Unit = {
    val s: String = "The greatest victory is that which requires no battle"
    println(reverseWords("The greatest victory is that which requires no battle"))
  }

  //https://www.codewars.com/kata/51c8991dee245d7ddf00000e
  //Complete the solution so that it reverses all of the words within the string passed in.
  //Words are separated by exactly one space and there are no leading or trailing spaces.
  //Example(Input --> Output):
  //"The greatest victory is that which requires no battle" -->
  //"battle no requires which that is victory greatest The"
  def reverseWords(str: String): String = {
    var array: Array[String] = str.split(" ");
    var sb: StringBuilder = new StringBuilder;
    for (i <- (0 to array.length - 1).reverse) {
      sb.append(array(i))
      if (i != 0) {
        sb.append(" ");
      }
    }
    sb.toString()
  }
}
