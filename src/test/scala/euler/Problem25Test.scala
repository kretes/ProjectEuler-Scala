package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem25Test extends FlatSpec with ShouldMatchers {
  "A Problem25 Solution" should "calculate the first fibonacci number with 1000 digits" in {
    Problem25.nthFibonacciTermWithDigitLength(1000) should be (4782)
  }
}

