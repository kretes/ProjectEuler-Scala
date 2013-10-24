package euler

object Problem8 {
  def toInt (c: Char): Int = Integer.parseInt(c.toString)

  def multiply (x: Int, y: Int) = x * y

  def solution (s: String): Int = {
    ((s sliding 5) map (i => i map toInt reduce multiply)).max
  }
}
