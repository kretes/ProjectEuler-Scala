package euler

import java.math.BigInteger

object Problem20 {
  def factorialDigitSum (i: Int): Int = {
    factorial(i).toString.map(_.asDigit).sum
  }

  def factorial (i: Int): BigInteger = {
    (1 to i).map(BigInteger.valueOf(_)).reduce(_.multiply(_))
  }
}
