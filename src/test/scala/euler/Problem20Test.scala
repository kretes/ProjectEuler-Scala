package euler

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class Problem20Test extends FlatSpec with ShouldMatchers {
  "A Problem20 Solution" should "be able to find the factorial digit sum of 10!" in {
    Problem20.factorialDigitSum(10) should be (27)
  }

  it should "be able to find the factorial digit sum of 100!" in {
    Problem20.factorialDigitSum(100) should be (648)
  }
}

