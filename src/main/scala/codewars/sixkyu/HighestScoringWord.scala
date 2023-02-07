package codewars.sixkyu

object HighestScoringWord {
  def main(args: Array[String]): Unit = {
    var myStr: String = "man i need a taxi up to ubud"
    println(
      myStr
        .split(" ")
        .map(s => (s, s.map(_ - 'a' + 1).sum))
        .maxBy(_._2)
        ._1
    )
  }

  //https://www.codewars.com/kata/57eb8fcdf670e99d9b000272
  //Given a string of words, you need to find the highest scoring word.
  //Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
  //For example, the score of abad is 8 (1 + 2 + 1 + 4).
  //You need to return the highest scoring word as a string.
  //If two words score the same, return the word that appears earliest in the original string.
  //All letters will be lowercase and all inputs will be valid.
  def high(s: String): String = s.split(' ').maxBy(_.map(_ - 96).sum)
}
