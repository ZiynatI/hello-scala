package codewars.eightkyu

object SuperDuperEasy {
  //https://www.codewars.com/kata/55a5bfaa756cfede78000026
  //Make a function that returns the value multiplied by 50 and increased by 6.
  //If the value entered is a string it should return "Error".
  def problem(a: String): String = {
    try {
      val s: String = (a.toInt * 50 + 6).toString
      s
    } catch {
      case e: Exception => "Error"
    }
  }
}
