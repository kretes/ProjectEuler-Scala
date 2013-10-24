package euler

object Problem8 {
  def toInt (c: Char): Int = Integer.parseInt(c.toString)

  def multiply (x: Int, y: Int) = x * y

  def solution (s: String): Int = {
    (0 to s.length - 5).map(i => s.substring(i, i + 5) map toInt reduce multiply).max
  }
}
