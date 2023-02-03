package fpscalacourse

object Currying {
  def main(args: Array[String]): Unit = {
    println(product(x => x * x)(1, 5))
    println(factorial(5))
  }

  //Write a product function,
  //that calculates the product of the values of a function for
  //the points of a given interval, similar to what we did to see sum function.
  //As a second step, write the factorial function in terms of product.
  //And as a third step, can you may be write a more general function,
  //that generalizes both sum and product?
  def product(f: Int => Int)(a: Int, b: Int): Int = if (a > b) {
    1
  } else {
    f(a) * product(f)(a + 1, b)
  }

  def factorial(n: Int) = product(x => x)(1, n)

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
    def recur(a: Int): Int = {
      if (a > b) {
        zero
      } else {
        combine(f(a), recur(a + 1))
      }
    }

    recur(a)
  }

  def sum(f: Int => Int) = mapReduce(f, (x, y) => x + y, 0)
}