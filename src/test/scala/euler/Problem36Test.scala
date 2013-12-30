package euler

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class Problem36Test extends FlatSpec with ShouldMatchers {
  it should "correctly sum all the numbers from 1 to 1 million that are palindromic in base 10 and base 2" in {
    Problem36.solution(1000000) should be (872187)
  }
}
