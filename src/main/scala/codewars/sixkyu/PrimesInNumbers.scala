package codewars.sixkyu

import scala.collection.mutable.ArrayBuffer

object PrimesInNumbers {
  def main(args: Array[String]): Unit = {
    println(factors(10))
    println(factors(10))

  }

  //https://www.codewars.com/kata/54d512e62a5e54c96200019e
  //Given a positive number n > 1 find the prime factor decomposition of n.
  //The result will be a string with the following form :
  // "(p1**n1)(p2**n2)...(pk**nk)"
  //with the p(i) in increasing order and n(i) empty if n(i) is 1.
  //Example: n = 86240 should return "(2**5)(5)(7**2)(11)"

  def factors(m: Int): String = {
    var sb: StringBuilder = new StringBuilder;
    var num: Int = m
    for (i <- getPrimes(m / 2)) {
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
    if (sb.isEmpty) {
      sb.append(s"($m)")
    }
    sb.toString()
  }

  def getPrimes(upTo: Int): Seq[Int] = {
    var vec = Vector.empty[Int]
    var p: Int = 2
    for (i <- 2 to upTo) {
      vec = vec :+ i
    }
    vec
  }

  val primes: LazyList[Int] = primeStream(LazyList.from(2))

  private def primeStream(s: LazyList[Int]): LazyList[Int] =
    s.head #:: primeStream(s.tail filter {
      _ % s.head != 0
    })
}
