package euler

object Problem8 {
  def solution (s: String): Int = {
    (0 to s.length - 5)
      .map(i => s.substring(i, i + 5)
      .map(c => Integer.parseInt(c.toString))
      .reduce(_ * _)).max
  }
}
