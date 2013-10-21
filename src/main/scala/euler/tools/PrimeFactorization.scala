package euler.tools

import ImplicitConversions._
import scala.collection.mutable.ListBuffer

object PrimeFactorization {

  case class PrimeFactor(base: Long, exponent: Long = 1) {
    override def toString = s"$base^$exponent"
    def toLong: Long = Math.pow(base, exponent).toLong
  }

  def Of (x: Long): Seq[PrimeFactor] = {
    var number = x
    val primeFactors = new ListBuffer[PrimeFactor]()

    if (number == 1) {
      primeFactors.toSeq
    } else if (number.isPrime) {
      primeFactors.append(PrimeFactor(number))
    } else {
      var divisor = 2L
      var exponent = 0L

      while (number >= divisor) {
        if (number % divisor == 0) {
          exponent += 1
          number = number / divisor
        } else {
          if (exponent > 0) {
            primeFactors.append(PrimeFactor(divisor, exponent))
          }
          divisor = divisor.nextPrime
          exponent = 0
        }
      }

      primeFactors.append(PrimeFactor(divisor, exponent))
    }
    primeFactors.toSeq
  }
}
