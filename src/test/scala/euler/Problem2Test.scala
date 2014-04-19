package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import euler.Problem2._

class Problem2Test extends FlatSpec with ShouldMatchers {

  it should "produce the correct sum of even fibonacci numbers less than 4 million" in {
    solution(4000000) should be (4613732)
  }
}

