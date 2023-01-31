package codewars.eightkyu

object ThirdAngleOfATriangle {
  //https://www.codewars.com/kata/5a023c426975981341000014
  //You are given two interior angles (in degrees) of a triangle.
  //Write a function to return the 3rd.
  //Note: only positive integers will be tested.
  def otherAngle(a: Int, b: Int): Int = 180 - a - b
}
