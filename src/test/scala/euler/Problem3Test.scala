package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import euler.Problem3._

class Problem3Test extends FlatSpec with ShouldMatchers {
  "A Problem3 Solution" should "have a method to identify all the prime factors of 13195" in {
    primeFactorsOf(13195) should be (List(5, 7, 13, 29))
  }
}

