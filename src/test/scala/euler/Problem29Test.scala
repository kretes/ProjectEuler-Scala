package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem29Test extends FlatSpec with ShouldMatchers {
  "A Problem29 Solution" should "return the correct distinct powers for combinations of base a and exponent b from 2 to 5" in {
    Problem29.solution(2, 5) should be (Set(4, 8, 9, 16, 25, 27, 32, 64, 81, 125, 243, 256, 625, 1024, 3125))
  }

  it should "return the correct count of distinct powers for combinations of base a and exponent b from 2 to 100" in {
    Problem29.solution(2, 100).size should be (9183)
  }
}
