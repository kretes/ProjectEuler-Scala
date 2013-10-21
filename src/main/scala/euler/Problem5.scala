package euler
import euler.tools.PrimeFactorization

object Problem5 {
  def solution (x: Long) = {
    (2L to x)
      .flatMap(PrimeFactorization.Of)
      .groupBy(_.base)
      .mapValues(_.reduce((pf1, pf2) => if (pf2.exponent > pf1.exponent) pf2 else pf1))
      .values
      .map(_.toLong)
      .reduce(_ * _)
  }
}
