package codewars.eightkyu

object CorrectTheMistakesOfTheCharacterRecognitionSoftware {
  //https://www.codewars.com/kata/577bd026df78c19bca0002c0
  //Character recognition software is widely used to digitise printed texts.
  //Thus the texts can be edited, searched and stored on a computer.
  //When documents (especially pretty old ones written with a typewriter),
  //are digitised character recognition softwares often make mistakes.
  //Your task is correct the errors in the digitised text.
  //You only have to handle the following mistakes:
  //    S is misinterpreted as 5
  //    O is misinterpreted as 0
  //    I is misinterpreted as 1
  //The test cases contain numbers only by mistake.
  def correctLetter(c: Char): Char = if (c == '5') {
    'S'
  } else if (c == '0') {
    'O'
  } else if (c == '1') {
    'I'
  } else {
    c
  }

  def correct(s: String): String = s.toCharArray.map(x => correctLetter(x)).mkString

}
