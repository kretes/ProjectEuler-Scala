package euler

object Problem14 {
  case class CollatzSequenceLength(number: Long, length: Long)

  def solution (limit: Long): Long = {
    (1L to limit map {
      n => CollatzSequenceLength(n, collatzSequenceOf(n).length)
    } reduce {
      (c1, c2) => if (c2.length > c1.length) c2 else c1
    }).number
  }

  def collatzSequenceOf (i: Long): Stream[Long] = {
    i #:: (if (i > 1) collatzSequenceOf(i match {
      case n if n % 2 == 0 => n / 2
      case _ => 3 * i + 1
    }) else Stream.empty)
  }
}
