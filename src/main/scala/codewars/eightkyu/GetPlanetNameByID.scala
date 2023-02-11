package codewars.eightkyu

object GetPlanetNameByID {
  //https://www.codewars.com/kata/515e188a311df01cba000003
  //The function is not returning the correct values. Can you figure out why?
  //Example (Input --> Output ):
  //3 --> "Earth"
  def getPlanetName(num: Int): String = {
    num match {
      case 1 => "Mercury"
      case 2 => "Venus"
      case 3 => "Earth"
      case 4 => "Mars"
      case 5 => "Jupiter"
      case 6 => "Saturn"
      case 7 => "Uranus"
      case 8 => "Neptune"
    }
  }
}
