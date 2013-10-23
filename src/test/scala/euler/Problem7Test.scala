package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem7Test extends FlatSpec with ShouldMatchers {
  "A Problem7 Solution" should "return the correct 6th prime" in {
    Problem7.nthPrime(6) should be (13)
  }

  it should "return the correct 10,001st prime" in {
    Problem7.nthPrime(10001) should be (104743)
  }
}
