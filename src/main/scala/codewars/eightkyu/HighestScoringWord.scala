package codewars.eightkyu

object HighestScoringWord {
  //https://www.codewars.com/kata/57eb8fcdf670e99d9b000272
  //Given a string of words, you need to find the highest scoring word.
  //Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
  //For example, the score of abad is 8 (1 + 2 + 1 + 4).
  //You need to return the highest scoring word as a string.
  //If two words score the same, return the word that appears earliest in the original string.
  //All letters will be lowercase and all inputs will be valid.
  def high(s: String): String = {
    val array: Array[String] = s.split(' ')
    var highestScore = 0
    var highestWord: String = ""
    for (word <- array) {
      var score = 0
      for (i <- 0 until word.length) {
        score = score + (word.charAt(i) - 96)

      }
      if (score > highestScore) {
        highestScore = score
        highestWord = word
      }
    }
    highestWord
  }
}
