package codewars.eightkyu

object SubtractTheSum {
  def main(args: Array[String]): Unit = {
    println(subtractSum(10))
  }
  //https://www.codewars.com/kata/56c5847f27be2c3db20009c3
  //NOTE! This kata can be more difficult than regular 8-kyu katas (lets say 7 or 6 kyu)
  //Complete the function which get an input number n such that n >= 10 and n < 10000, then:
  //    Sum all the digits of n.
  //    Subtract the sum from n, and it is your new n.
  //    If the new n is in the list below return the associated fruit, otherwise return back to task 1.
  //Example
  //n = 325
  //sum = 3+2+5 = 10
  //n = 325-10 = 315 (not in the list)
  //sum = 3+1+5 = 9
  //n = 315-9 = 306 (not in the list)
  //sum = 3+0+6 = 9
  //n =306-9 = 297 (not in the list)
  //.
  //.
  //...until you find the first n in the list below.
  //There is no preloaded code to help you. This is not about coding skills; think before you code

  def subtractSum(n: Int): String = {
    val mapString =
      """    1-kiwi
    2-pear
    3-kiwi
    4-banana
    5-melon
    6-banana
    7-melon
    8-pineapple
    9-apple
    10-pineapple
    11-cucumber
    12-pineapple
    13-cucumber
    14-orange
    15-grape
    16-orange
    17-grape
    18-apple
    19-grape
    20-cherry
    21-pear
    22-cherry
    23-pear
    24-kiwi
    25-banana
    26-kiwi
    27-apple
    28-melon
    29-banana
    30-melon
    31-pineapple
    32-melon
    33-pineapple
    34-cucumber
    35-orange
    36-apple
    37-orange
    38-grape
    39-orange
    40-grape
    41-cherry
    42-pear
    43-cherry
    44-pear
    45-apple
    46-pear
    47-kiwi
    48-banana
    49-kiwi
    50-banana
    51-melon
    52-pineapple
    53-melon
    54-apple
    55-cucumber
    56-pineapple
    57-cucumber
    58-orange
    59-cucumber
    60-orange
    61-grape
    62-cherry
    63-apple
    64-cherry
    65-pear
    66-cherry
    67-pear
    68-kiwi
    69-pear
    70-kiwi
    71-banana
    72-apple
    73-banana
    74-melon
    75-pineapple
    76-melon
    77-pineapple
    78-cucumber
    79-pineapple
    80-cucumber
    81-apple
    82-grape
    83-orange
    84-grape
    85-cherry
    86-grape
    87-cherry
    88-pear
    89-cherry
    90-apple
    91-kiwi
    92-banana
    93-kiwi
    94-banana
    95-melon
    96-banana
    97-melon
    98-pineapple
    99-apple
    100-pineapple""".split("\n").map { line =>
        val split = line.trim.split("-")
        split(0).toInt -> split(1)
      }.toMap
    var s: String = ""
    var num: Int = n
    while (s.equals("")) {
      num = num - num.toString.map(x => x.getNumericValue).sum
      s = mapString.getOrElse(num, "")
    }
    s
  }

  def getFruit(n: Int): String = {
    var A: Map[Int, String] = Map()
    A += (1 -> "kiwi")
    A += (2 -> "pear")
    A += (3 -> "kiwi")
    A += (4 -> "banana")
    A += (5 -> "melon")
    A += (6 -> "banana")
    A += (7 -> "melon")
    A += (8 -> "pineapple")
    A += (9 -> "apple")
    A += (10 -> "pineapple")
    A += (11 -> "cucumber")
    A += (12 -> "pineapple")
    A += (13 -> "cucumber")
    A += (14 -> "orange")
    A += (15 -> "grape")
    A += (16 -> "orange")
    A += (17 -> "grape")
    A += (18 -> "apple")
    A += (19 -> "grape")
    A += (20 -> "cherry")
    A += (21 -> "pear")
    A += (22 -> "cherry")
    A += (23 -> "pear")
    A += (24 -> "kiwi")
    A += (25 -> "banana")
    A += (26 -> "kiwi")
    A += (27 -> "apple")
    A += (28 -> "melon")
    A += (29 -> "banana")
    A += (30 -> "melon")
    A += (31 -> "pineapple")
    A += (32 -> "melon")
    A += (33 -> "pineapple")
    A += (34 -> "cucumber")
    A += (35 -> "orange")
    A += (36 -> "apple")
    A += (37 -> "orange")
    A += (38 -> "grape")
    A += (39 -> "orange")
    A += (40 -> "grape")
    A += (41 -> "cherry")
    A += (42 -> "pear")
    A += (43 -> "cherry")
    A += (44 -> "pear")
    A += (45 -> "apple")
    A += (46 -> "pear")
    A += (47 -> "kiwi")
    A += (48 -> "banana")
    A += (49 -> "kiwi")
    A += (50 -> "banana")
    A += (51 -> "melon")
    A += (52 -> "pineapple")
    A += (53 -> "melon")
    A += (54 -> "apple")
    A += (55 -> "cucumber")
    A += (56 -> "pineapple")
    A += (57 -> "cucumber")
    A += (58 -> "orange")
    A += (59 -> "cucumber")
    A += (60 -> "orange")
    A += (61 -> "grape")
    A += (62 -> "cherry")
    A += (63 -> "apple")
    A += (64 -> "cherry")
    A += (65 -> "pear")
    A += (66 -> "cherry")
    A += (67 -> "pear")
    A += (68 -> "kiwi")
    A += (69 -> "pear")
    A += (70 -> "kiwi")
    A += (71 -> "banana")
    A += (72 -> "apple")
    A += (73 -> "banana")
    A += (74 -> "melon")
    A += (75 -> "pineapple")
    A += (76 -> "melon")
    A += (77 -> "pineapple")
    A += (78 -> "cucumber")
    A += (79 -> "pineapple")
    A += (80 -> "cucumber")
    A += (81 -> "apple")
    A += (82 -> "grape")
    A += (83 -> "orange")
    A += (84 -> "grape")
    A += (85 -> "cherry")
    A += (86 -> "grape")
    A += (87 -> "cherry")
    A += (88 -> "pear")
    A += (89 -> "cherry")
    A += (90 -> "apple")
    A += (91 -> "kiwi")
    A += (92 -> "banana")
    A += (93 -> "kiwi")
    A += (94 -> "banana")
    A += (95 -> "melon")
    A += (96 -> "banana")
    A += (97 -> "melon")
    A += (98 -> "pineapple")
    A += (99 -> "apple")
    A += (100 -> "pineapple")
    A.getOrElse(n, "")
  }
}
