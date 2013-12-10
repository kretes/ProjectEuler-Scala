package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem35Test extends FlatSpec with ShouldMatchers {
  "A Problem35 Solution" should "correctly list the circular primes below 100" in {
    Problem35.solution(100) should be (List(2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, 97))
  }

  it should "correctly number the circular primes below 1 million" in {
    val circularPrimes = Problem35.solution(1000000)
    circularPrimes.size should be (55)
  }
}
