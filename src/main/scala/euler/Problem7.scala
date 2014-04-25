package euler


object Problem7 {

  def isPrime(n: Long)= if(n ==2) true else primes.takeWhile(_ <= n / 2).find(n % _ == 0).map(_ == n).getOrElse(true)

  def primesFrom (start: Long): Stream[Long] = if(isPrime(start)) start #:: primesFrom(start+1) else primesFrom(start+1)

  val primes: Stream[Long] = 2 #:: primesFrom(3)

  def nthPrime (n: Int): Long = primes(n)
}
