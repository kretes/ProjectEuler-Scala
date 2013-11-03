package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem16Test extends FlatSpec with ShouldMatchers {
  "A Problem16 Solution" should "return the correct power digit sum for 2^15" in {
    Problem16.solution(base = 2, exponent = 15) should be (26)
  }

  it should "return the correct power digit sum for 2^1000" in {
    Problem16.solution(base = 2, exponent = 1000) should be (1366)
  }
}
