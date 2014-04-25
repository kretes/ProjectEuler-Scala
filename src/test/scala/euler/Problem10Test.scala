package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem10Test extends FlatSpec with ShouldMatchers {
  "A Problem10 Solution" should "return the correct answer for the sum of primes below 10" in {
    Problem10.solution(10) should be (17)
  }

  "A Problem10 Solution" should "return the correct answer for the sum of primes below 1000" in {
    Problem10.solution(1000) should be (76127)
  }

  //0.8 -> 0.3 (find1) -> 0.2(find2)
  it should "return the correct answer for the sum of primes below 10000" in {
    Problem10.solution(10000L) should be (5736396L)
  }

  //18 -> 9(find1) -> 7(find2) -> 1.8(Vec)
  it should "return the correct answer for the sum of primes below 50000" in {
    Problem10.solution(50000L) should be (121013308L)
  }

  //27 (find1) -> 18(find2) -> 5(Vec)
  it should "return the correct answer for the sum of primes below 100000" in {
    Problem10.solution(100000L) should be (454396537L)
  }

  it should "return the correct answer for the sum of primes below 500000" in {
    Problem10.solution(400000L) should be (17)
  }

  it should "return the correct answer for the sum of primes below 2 million" in {
    Problem10.solution(2000000L) should be (142913828922L)
  }
}

