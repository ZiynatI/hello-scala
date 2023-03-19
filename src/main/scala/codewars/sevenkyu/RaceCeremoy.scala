package codewars.sevenkyu

object RaceCeremony {
  def main(args: Array[String]): Unit = {
    println(racePodium(100000))
  }

  //https://www.codewars.com/kata/62cecd4e5487c10028996e04
  //The national go-kart racing competition is taking place at your local town and you've
  //been called for building the winners podium with the available wooden blocks.
  //Thankfully you are in a wood-rich area, number of blocks are always at least 6.
  //Remember a classic racing podium has three platforms for first, second and third place.
  //First place is the highest and second place is higher than third. Also notice that platforms are arranged as 2nd - 1st - 3rd.
  //The organizers want a podium that satisfies:
  //    The first place platform has the minimum height possible
  //    The second place platform has the closest height to first place
  //    All platforms have heights greater than zero.
  //Task:
  //Given the numbers of blocks available, return an array / tuple or another data structure depending on the language
  //(refer sample tests) with the heights of 2nd, 1st, 3rd places platforms.
  //Examples (input -> output)
  //11 ->   [4, 5, 2]
  //6  ->   [2, 3, 1]
  //10 ->   [4, 5, 1]
  def racePodium(blocks: Int): (Int, Int, Int) = {
    var mod: Int = blocks % 6
    if (blocks % 6 == 0) {
      var third = (blocks - 6) / 3
      return (third + 2, third + 3, third + 1)
    } else if (blocks % 6 == 1) {
      var third: Int = (blocks - 7) / 3
      return (third + 2, third + 4, third + 1)
    } else if (blocks % 6 == 2) {
      var third: Int = (blocks - 8) / 3
      return (third + 3, third + 4, third + 1)
    } else if (blocks % 6 == 3) {
      var third: Int = (blocks - 9) / 3
      return (third + 3, third + 5, third + 1)
    } else if (blocks % 6 == 4) {
      var third: Int = (blocks - 10) / 3
      return (third + 4, third + 5, third + 1)
    } else {
      var third: Int = (blocks - 11) / 3
      return (third + 4, third + 5, third + 2)
    }
  }
}
