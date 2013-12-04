package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem30Test extends FlatSpec with ShouldMatchers {
  "A Problem30 Solution" should "return the correct sum of all numbers that can be written as the sum of the fifth powers of their digits" in {
    Problem30.solution should be (443839)
  }
}

