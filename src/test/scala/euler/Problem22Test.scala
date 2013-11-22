package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem22Test extends FlatSpec with ShouldMatchers {
  "A Problem22 Solution" should "calculate the alphabetical value of COLIN" in {
    Problem22.alphabeticalValueOf("COLIN") should be (53)
  }

  it should "be able to calculate the alphabetical value of mixed-case strings" in {
    Problem22.alphabeticalValueOf("ColIn") should be (53)
  }

  it should "calculate the total of all the name scores in the file" in {
    Problem22.nameScoreTotal should be (871198282)
  }
}
