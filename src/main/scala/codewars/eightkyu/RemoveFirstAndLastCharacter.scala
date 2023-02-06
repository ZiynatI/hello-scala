package codewars.eightkyu

object RemoveFirstAndLastCharacter {
  //It's pretty straightforward.
  //Your goal is to create a function that removes the first and last characters of a string.
  //You're given one parameter, the original string.
  //You don't have to worry with strings with less than two characters.
  def removeChars(s: String): String = {
    var sb: StringBuilder = new StringBuilder
    for (i <- 1 until s.length - 1) {
      sb.append(s.charAt(i))
    }
    sb.toString()
  }
}
