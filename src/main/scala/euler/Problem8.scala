package euler

object Problem8 {
  def toInt (c: Char): Int = Integer.parseInt(c.toString)

  def solution (s: String): Int = ((s sliding 5) map (_ map toInt reduce (_ * _))).max
}
