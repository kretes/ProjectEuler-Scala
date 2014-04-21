package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import euler.Problem4.solution

class Problem4Test extends FlatSpec with ShouldMatchers {
  "A Problem4 Solution" should "calculate simple answer" in {
    Problem4.palindromeProductOf(2) should be (9009)
  }

  "A Problem4 Solution" should "return the correct answer" in {
    solution should be (906609)
  }
}

