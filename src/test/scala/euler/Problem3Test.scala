package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import euler.Problem3._

class Problem3Test extends FlatSpec with ShouldMatchers {
  "A Problem3 Solution" should "have a method to identify all the prime factors of 13195" in {
    primeFactorsOf(13195) should be (List(5, 7, 13, 29))
  }

  it should "return the correct largest prime factor of 13195" in {
    largestPrimeFactorOf(13195) should be (29)
  }

  it should "return the correct largest prime factor of 600851475143" in {
    largestPrimeFactorOf(600851475143L) should be (6857)
  }
}

