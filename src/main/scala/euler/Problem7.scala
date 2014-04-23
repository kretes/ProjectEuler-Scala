package euler


object Problem7 {
  def primesFrom (start: Long): Stream[Long] = if(Problem3.primeFactorOf(start) == start) start #:: primesFrom(start+1) else primesFrom(start+1)

  def nthPrime (n: Int): Long = primesFrom(2)(n)
}
