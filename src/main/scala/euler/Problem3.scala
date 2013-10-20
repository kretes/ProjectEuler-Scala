package euler
import tools.ImplicitConversions._

object Problem3 {
  def primeFactorsOf(n: Long): List[Long] = {
    n.primeFactors
  }

  def largestPrimeFactorOf(n: Long): Long = {
    n.primeFactors.last
  }
}
