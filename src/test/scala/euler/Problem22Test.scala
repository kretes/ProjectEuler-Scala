package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem22Test extends FlatSpec with ShouldMatchers {
  "A Problem22 Solution" should "calculate the alphabetical value of COLIN" in {
    Problem22.alphabeticalValueOf("COLIN") should be (53)
  }
}
