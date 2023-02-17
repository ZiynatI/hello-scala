package codewars.sixkyu

import org.scalatest._
import org.scalatest.Assertions._
import org.scalatest.flatspec.AnyFlatSpec

import PrimesInNumbersTest._

class PrimesInNumbersTest extends AnyFlatSpec {
  it should "pass basic tests" in {
    testing(7775460, "(2**2)(3**3)(5)(7)(11**2)(17)")
    testing(7919, "(7919)")
  }

  it should "pass more advanced test" in {
    testing(18195729, "(3)(17**2)(31)(677)")
    testing(933555431, "(7537)(123863)")
    testing(342217392, "(2**4)(3)(11)(43)(15073)")
    testing(35791357, "(7)(5113051)")

  }
}

object PrimesInNumbersTest {
  private def testing(m: Int, expect: String): Unit = {
    println("Testing: " + m)
    val actual: String = PrimesInNumbers.factors(m)
    println("Actual: " + actual)
    println("Expect: " + expect)
    assertResult(expect){actual}
  }
}

