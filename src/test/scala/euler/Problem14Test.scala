package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem14Test extends FlatSpec with ShouldMatchers {
  "A Problem14 Solution" should "return the correct collatz sequence for 13" in {
    Problem14.collatzSequenceOf(13) should be (Seq(13, 40, 20, 10, 5, 16, 8, 4, 2, 1))
  }

  it should "return the correct number under 1 million with the longest collatz sequence" in {
    Problem14.solution(1000000) should be (837799)
  }
}

