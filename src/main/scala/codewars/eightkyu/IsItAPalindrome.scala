package codewars.eightkyu

object IsItAPalindrome {
  //https://www.codewars.com/kata/57a1fd2ce298a731b20006a4
  //Write a function that checks if a given string (case insensitive) is a palindrome.
  def isPalindrome(s: String): Boolean = s.equalsIgnoreCase(s.reverse)

}
