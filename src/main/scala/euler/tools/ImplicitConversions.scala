package euler.tools

object ImplicitConversions {
  implicit class PrimeAwareLong(val self: Long) extends AnyVal {
    def isPrime: Boolean =
      self match {
        case 1L => false
        case x if x % 2L == 0L => self == 2L
        case _ => {
          !(3L to Math.sqrt(self).toLong by 2L)
            .map(self % _ == 0)
            .reduceLeftOption(_ || _)
            .getOrElse(false)
        }
      }

    def nextPrime: Long =
      self match {
        case 1L => 2L
        case _ => {
          (self + 1L to self * 2L).toStream.find(_.isPrime).get
        }
      }

    def primeFactors: List[Long] = {
      def primeFactorsFrom(n: Long): Stream[Long] = {
        n #:: primeFactorsFrom(n.nextPrime)
      }

      primeFactorsFrom(3L)
        .takeWhile(_ < Math.sqrt(self).toLong)
        .filter(self % _ == 0)
        .toList
    }
  }
}



