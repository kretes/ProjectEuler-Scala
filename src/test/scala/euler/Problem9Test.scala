package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem9Test extends FlatSpec with ShouldMatchers {
  "A Problem9 Solution" should "return the correct answer for 12" in {
    Problem9.solution(12).get should be (3, 4, 5)
  }

  it should "return the correct answer for 1000" in {
    Problem9.solution(1000).get should be (200, 375, 425)
  }
}
