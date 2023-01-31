package demo

class ClassDemo {


}

class Point(val xc: Int, val yc: Int) {
  var x: Int = xc;
  var y: Int = yc;

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }
}

class Location(override val xc: Int, override val yc: Int) extends Point(xc, yc) {

}
