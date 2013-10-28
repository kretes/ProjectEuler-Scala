package euler

import euler.tools.ImplicitConversions._

object Problem10 {
  def solution (limit: Long): Long = {
    def primesFrom (start: Long): Stream[Long] = start #:: primesFrom(start.nextPrime)

    primesFrom(2).takeWhile(_ < limit).sum
  }
}
