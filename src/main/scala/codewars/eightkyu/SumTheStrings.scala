package codewars.eightkyu

object SumTheStrings {
  //https://www.codewars.com/kata/5966e33c4e686b508700002d
  //Create a function that takes 2 integers in form of a string as an input, and outputs the sum (also as a string):
  //Example: (Input1, Input2 -->Output)
  //"4",  "5" --> "9"
  //"34", "5" --> "39"
  //"", "" --> "0"
  //"2", "" --> "2"
  //"-5", "3" --> "-2"
  //Notes:
  //    If either input is an empty string, consider it as zero.
  //    Inputs and the expected output will never exceed the signed 32-bit integer limit (2^31 - 1)
  def stringSum(a: String, b: String): String = {
    var i1: Int = if (a.equals("")) {
      0
    } else {
      a.toInt
    }
    var i2: Int = if (b.equals("")) {
      0
    } else {
      b.toInt
    }
    (i1 + i2).toString
  }
}
