package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem10Test extends FlatSpec with ShouldMatchers {
  "A Problem10 Solution" should "work for sum of primes below 10" in {
    Problem10.solution(10) should be (17)
  }

//  it should "calculate primes below 20" in {
//    Problem10.primes.takeWhile(_ < 20).toList should be (List(2, 3,  5,  7,  11,  13,  17,  19))
//  }

  it should "work for sum of primes below 20" in {
    Problem10.solution(20) should be (77)
  }

  it should "work for sum of primes below 1000" in {
    Problem10.solution(1000) should be (76127)
  }

  //0.8 -> 0.3 (find1) -> 0.2(find2) -> 0.1 (order)
  it should "work for sum of primes below 10000" in {
    Problem10.solution(10000L) should be (5736396L)
  }

  //18 -> 9(find1) -> 7(find2) -> 1.8(Vec) -> 0.5 (order)
  it should "work for sum of primes below 50000" in {
    Problem10.solution(50000L) should be (121013308L)
  }

  //27 (find1) -> 18(find2) -> 5(Vec) -> 1.7(order)
  it should "work for sum of primes below 100000" in {
    Problem10.solution(100000L) should be (454396537L)
  }

  //?
  it should "work for sum of primes below 200000" in {
    Problem10.solution(200000L) should be (454396537L)
  }

  //107(Vec) -> 41 (order)
  it should "work for sum of primes below 500000" in {
    Problem10.solution(400000L) should be (6458901531L)
  }

  //350 (with prime factorization)
  it should "work for sum of primes below 2 million" in {
    Problem10.solution(2000000L) should be (142913828922L)
  }
}

