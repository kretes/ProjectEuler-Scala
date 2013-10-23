package euler

import euler.tools.ImplicitConversions._

object Problem7 {
  def primesFrom (start: Long): Stream[Long] = start #:: primesFrom(start.nextPrime)

  def nthPrime (n: Int): Long = (primesFrom(2) take n).toList.last
}
