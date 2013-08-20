package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import euler.Problem1.solution

class Problem1Test extends FlatSpec with ShouldMatchers {
  "A Problem1 Solution" should "be correct for the simple case" in {
    solution(10) should be (23)
  }
}
