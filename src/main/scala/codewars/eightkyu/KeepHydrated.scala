package codewars.eightkyu

object KeepHydrated {
  //https://www.codewars.com/kata/582cb0224e56e068d800003c
  //Nathan loves cycling.
  //Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
  //You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
  def litres(time: Double): Int = {
    (time / 2).asInstanceOf[Int]
  }
}
