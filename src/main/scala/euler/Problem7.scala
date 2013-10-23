package euler

import euler.tools.ImplicitConversions._

object Problem7 {
  def nthPrime (n: Int): Long = {
    var acc: Long = 2
    1 until n foreach (x => acc = acc.nextPrime)
    acc
  }
}
