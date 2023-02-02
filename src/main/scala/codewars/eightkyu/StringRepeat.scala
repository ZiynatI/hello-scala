package codewars.eightkyu

object StringRepeat {
  //https://www.codewars.com/kata/57a0e5c372292dd76d000d7e
  //Write a function that accepts an integer n and a string s as parameters,
  //and returns a string of s repeated exactly n times.
  //Examples (input -> output)
  //6, "I"     -> "IIIIII"
  //5, "Hello" -> "HelloHelloHelloHelloHello"


  def repeatStr(times: Int, str: String): String = {
    var sb: StringBuilder = new StringBuilder
    for (i <- 0 to times) {
      sb.append(str)
    }
    sb.toString()
  }
}
