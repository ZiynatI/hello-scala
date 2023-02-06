package codewars.eightkyu

object RemoveExclamationMarks {
  //https://www.codewars.com/kata/57a0885cbb9944e24c00008e
  //Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
  def removeExclamationMarks(s: String): String =
    s.chars().map(x => if (x == '!') {
      0
    } else {
      x
    }).
}
