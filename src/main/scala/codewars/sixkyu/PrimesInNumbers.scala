package codewars.sixkyu

object PrimesInNumbers {
  //https://www.codewars.com/kata/54d512e62a5e54c96200019e
  //Given a positive number n > 1 find the prime factor decomposition of n.
  //The result will be a string with the following form :
  // "(p1**n1)(p2**n2)...(pk**nk)"
  //with the p(i) in increasing order and n(i) empty if n(i) is 1.
  //Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
  def isPrime(n: Int): Boolean = (1 to n / 2).filter(x => n % x == 0).sum <= 2

  def getPrimesToN(n: Int, list: List[Int]): List[Int] = {
    for (i <- 1 to n) {
      var factors: Int = 0
      for (j <- list) {
        if (i % j == 0) {
          factors = factors + 1
        }
      }
      if (factors <= 2) {
        list.::(i)
      }
    }
    list
  }

  def factors(m: Int): String = {
    var list: List[Int] = List(1)
    var sb: StringBuilder = new StringBuilder
    var num: Int = m
    while (num > 1) {
      var power: Int = 0;
      for (i <- list) {
        while (num % i == 0) {
          power = power + 1
          num = num / i
        }
        if (power == 1) {
          sb.append(s"($i)")
        } else if (power > 1) {
          sb.append(s"($i**$power)")
        }
      }
    }
    sb.toString()
  }
}
