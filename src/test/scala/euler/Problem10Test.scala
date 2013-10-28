package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem10Test extends FlatSpec with ShouldMatchers {
  "A Problem10 Solution" should "return the correct answer for the sum of primes below 10" in {
    Problem10.solution(10) should be (17)
  }

  it should "return the correct answer for the sum of primes below 2 million" in {
    Problem10.solution(2000000L) should be (142913828922L)
  }
}

