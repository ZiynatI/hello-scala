package codewars.sevenkyu

object CatsAndShelves {
  //https://www.codewars.com/kata/62c93765cef6f10030dfa92b
  //An infinite number of shelves are arranged one above the other in a staggered fashion.
  //The cat can jump either one or three shelves at a time: from shelf i to shelf i+1 or i+3 (the cat cannot climb on the shelf directly above its head), according to the illustration:
  //                 ┌────────┐
  //                 │-6------│
  //                 └────────┘
  //┌────────┐
  //│------5-│
  //└────────┘  ┌─────► OK!
  //            │    ┌────────┐
  //            │    │-4------│
  //            │    └────────┘
  //┌────────┐  │
  //│------3-│  │
  //BANG!────┘  ├─────► OK!
  //  ▲  |\_/|  │    ┌────────┐
  //  │ ("^-^)  │    │-2------│
  //  │ )   (   │    └────────┘
  //┌─┴─┴───┴┬──┘
  //│------1-│
  //└────────┘
  //Input
  //Start and finish shelf numbers (always positive integers, finish no smaller than start)
  //Task
  //Find the minimum number of jumps to go from start to finish
  //Example
  //Start 1, finish 5, then answer is 2 (1 => 4 => 5 or 1 => 2 => 5)
  def catsAndShelves(start: Int, finish: Int): Int = {
    val shelves: Int = (finish - start)
    var result: Int = 0;
    if (shelves == 0) {
      result = 0
    } else if (shelves % 3 == 0) {
      result = shelves / 3
    } else if (shelves % 3 == 1) {
      result = shelves / 3 + 1
    } else if (shelves % 3 == 2) {
      result = shelves / 3 + 2
    }
    result
  }
}
