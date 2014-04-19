package euler


object Problem3 {

  val twoToInfinity: Stream[Long] = 2L #:: twoToInfinity.scanLeft(3L)((a,b) => a + 1)
  
  def largestPrimeFactorOf(n: Long): Long = primeFactorsOf(n).max

  def primeFactorsOf(n: Long): List[Long] = primeFactors(n, List()).sorted

  def primeFactorOf(n: Long): Long = twoToInfinity.takeWhile(_ < n / 2).find(n % _ == 0).getOrElse(n)

  def primeFactors(number: Long, foundPrimeFactors: List[Long]): List[Long] = number match {
    case 1 => foundPrimeFactors
    case _ => primeFactors(number / primeFactorOf(number), primeFactorOf(number) +: foundPrimeFactors)
  }

}
