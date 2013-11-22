package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem21Test extends FlatSpec with ShouldMatchers {
  "A Problem 21 Solution" should "produce the sum of proper divisors of 220" in {
    Problem21.properDivisorsSum(220) should be (284)
  }

  it should "produce the sum of proper divisors of 284" in {
    Problem21.properDivisorsSum(284) should be (220)
  }

  it should "evaluate the sum of all amicable numbers under 10,000" in {
    Problem21.solution(10000) should be (31626)
  }
}
