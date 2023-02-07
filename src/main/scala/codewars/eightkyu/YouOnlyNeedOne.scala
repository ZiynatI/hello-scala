package codewars.eightkyu

object YouOnlyNeedOne {
  //https://www.codewars.com/kata/57cc975ed542d3148f00015b
  //You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.
  //Array can contain numbers or strings. X can be either.
  //Return true if the array contains the value, false if not.
  def check(seq: List[Any], elem: Any) = {
    var b: Boolean = false
    for (i <- 0 until seq.length) {
      if (seq(i).equals(elem)) {
        b = true
      }
    }
    b
  }
}
