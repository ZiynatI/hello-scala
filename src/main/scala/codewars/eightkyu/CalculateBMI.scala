package codewars.eightkyu

object CalculateBMI {
  //https://www.codewars.com/kata/57a429e253ba3381850000fb
  //Write function bmi that calculates body mass index (bmi = weight / height2).
  //if bmi <= 18.5 return "Underweight"
  //if bmi <= 25.0 return "Normal"
  //if bmi <= 30.0 return "Overweight"
  //if bmi > 30 return "Obese"
  def bmi(weight: Int, height: Double): String = {
    var bmi: Double = weight.toDouble / (height * height)
    if (bmi <= 18.5) {
      "Underweight"
    } else if (bmi <= 25.0) {
      "Normal"
    } else if (bmi <= 30.0) {
      "Overweight"
    } else {
      "Obese"
    }
  }
}
