package codewars.sixkyu

object PrimesInNumbers {
  def main(args: Array[String]): Unit = {
//    println(getPrimes(100))
    println(factors(10))
  }

  //https://www.codewars.com/kata/54d512e62a5e54c96200019e
  //Given a positive number n > 1 find the prime factor decomposition of n.
  //The result will be a string with the following form :
  // "(p1**n1)(p2**n2)...(pk**nk)"
  //with the p(i) in increasing order and n(i) empty if n(i) is 1.
  //Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
  def getPrimes(n: Int): List[Int] = {
    var list: List[Int] = List(1)
    for (i <- 2 to n) {
      var nums: Int = 0
      for (j <- list) {
        if (i % j == 0) {
          nums = nums + 1
        }
      }
      if (nums <= 1) {
        list = i :: list
      }
    }
    list
  }

  def factors(m: Int): String = {
    var sb: StringBuilder = new StringBuilder;
    var num: Int = m
    val list: List[Int] = getPrimes(m)
     for (i <- list) {
      var power: Int = 0
      while (num % i == 0) {
        power = power + 1
        num = num / i
      }
      if (power == 1) {
        sb.append("(" + i + ")")
      } else if (power > 1) {
        sb.append("(" + i + "**" + power + ")")
      }
    }
    sb.toString()
  }
}
