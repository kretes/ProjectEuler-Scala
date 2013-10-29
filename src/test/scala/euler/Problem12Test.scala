package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem12Test extends FlatSpec with ShouldMatchers {
  "A Problem12 Solution" should "return the value of the first triangle number to have over five hundred divisors" in {
    Problem12.solution(500) should be (76576500)
  }
}

