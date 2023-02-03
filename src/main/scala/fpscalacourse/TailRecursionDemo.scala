package fpscalacourse

class TailRecursionDemo {
  //The sum function uses linear recursion. Write a tail-recursive version by replacing ???s.
  def sum(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = if (a > b) {
      0
    } else {
      loop(a + 1, acc + a)
    }
    loop(a, 0)
  }

}
