package codewars.eightkyu

object SimpleMultiplication {
  //https://www.codewars.com/kata/583710ccaa6717322c000105
  //This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
  def multiply(n: Int): Int = if (n % 2 == 0) {
    n * 8
  } else {
    n * 9
  }

}
