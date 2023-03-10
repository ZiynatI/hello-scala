package codewars.eightkyu

object ReduceButGrow {
  //https://www.codewars.com/kata/57f780909f7e8e3183000078
  //Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
  //[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
  def grow(xs: List[Long]): Long = xs.fold(1L)((x, y) => x * y)
}
