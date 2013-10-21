package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem5Test extends FlatSpec with ShouldMatchers {
  "A Problem3 Solution" should "return the correct solution for 10" in {
    Problem5.solution(10) should be (2520)
  }

  it should "return the correct solution for 20" in {
    Problem5.solution(20) should be (232792560)
  }
}

