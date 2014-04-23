package euler

object Problem8 {

  def solution (s: String): Int = s.sliding(5).map(_.map(_.toString.toInt).reduce((_ * _))).max
}
