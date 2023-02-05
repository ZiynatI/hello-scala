package codewars.eightkyu

object ReversedStrings {
  //https://www.codewars.com/kata/5168bb5dfe9a00b126000018
  //Complete the solution so that it reverses the string passed into it.
  //'world'  =>  'dlrow'
  //'word'   =>  'drow'
  def solution(word: String): String = word.reverse

  def solution2(word: String): String = {
    var result: StringBuilder = new StringBuilder
    for (i <- word.length - 1 to 0) {
      result.append(word.charAt(i))
    }
    result.toString()
  }


}
