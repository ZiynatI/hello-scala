package codewars.eightkyu

object FilterOutTheGeese {
  //https://www.codewars.com/kata/57ee4a67108d3fd9eb0000e7
  //Write a function that takes a list of strings as an argument and returns
  //a filtered list containing the same elements but with the 'geese' removed.
  //The geese are any strings in the following array, which is pre-populated in your solution:
  //  ["African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher"]
  //For example, if this array were passed as an argument:
  // ["Mallard", "Hook Bill", "African", "Crested", "Pilgrim", "Toulouse", "Blue Swedish"]
  //Your function would return the following array:
  //["Mallard", "Hook Bill", "Crested", "Blue Swedish"]
  //The elements in the returned array should be in the same order as in the initial array
  //passed to your function, albeit with the 'geese' removed. Note that all of the strings
  //will be in the same case as those provided, and some elements may be repeated.
  def main(args: Array[String]): Unit = {
    gooseFilter(List("Mallard", "Hook Bill", "African", "Crested", "Pilgrim", "Toulouse", "Blue Swedish"))
  }

  val geese: Array[String] = Array("African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher")


  def gooseFilter(birds: List[String]): List[String] = {
    var result: List[String] = List.empty
    var isGoose: Boolean = false;
    for (i <- 0 until birds.length; j <- 0 until geese.length) {
      if (birds(i).equals(geese(j))) {
        isGoose = true
      }
      if (j == geese.length - 1) {
        if (isGoose) {
          isGoose = false
        } else {
          result = birds(i) :: result
        }
      }
    }
    result.reverse
  }
}
