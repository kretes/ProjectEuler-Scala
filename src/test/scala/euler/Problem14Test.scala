package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem14Test extends FlatSpec with ShouldMatchers {

  it should "return the correct number under 1 million with the longest collatz sequence" in {
    Problem14.solution(1000000) should be (837799)
  }
}

