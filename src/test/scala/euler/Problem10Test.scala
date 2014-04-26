package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem10Test extends FlatSpec with ShouldMatchers {
  "A Problem10 Solution" should "work for sum of primes below 10" in {
    Problem10.solution(10) should be (17)
  }

  it should "1_work for sum of primes below 20" in {
    Problem10.solution(20) should be (77)
  }

  it should "2_work for sum of primes below 50" in {
    Problem10.solution(50) should be (328)
  }

  it should "3_work for sum of primes below 100" in {
    Problem10.solution(100) should be (1060)
  }

  it should "4_work for sum of primes below 1000" in {
    Problem10.solution(1000) should be (76127)
  }

  //0.8 -> 0.3 (find1) -> 0.2(find2) -> 0.1 (order)
  it should "5_work for sum of primes below 10000" in {
    Problem10.solution(10000) should be (5736396L)
  }

  //18 -> 9(find1) -> 7(find2) -> 1.8(Vec) -> 0.5 (order)
  it should "6_work for sum of primes below 50000" in {
    Problem10.solution(50000) should be (121013308L)
  }

  //27 (find1) -> 18(find2) -> 5(Vec) -> 1.7(order)
  it should "7_work for sum of primes below 100000" in {
    Problem10.solution(100000) should be (454396537L)
  }

  //5.8(memory_min)
  it should "8_work for sum of primes below 200000" in {
    Problem10.solution(200000) should be (1709600813)
  }

  //107(Vec) -> 41 (order) -> 20(mem_min) -> 12 (sieve)
  it should "9_work for sum of primes below 400000" in {
    Problem10.solution(400000) should be (6458901531L)
  }

  //350 (with prime factorization),474 (sieve)
  it should "99_work for sum of primes below 2 million" in {
    Problem10.solution(2000000) should be (142913828922L)
  }
}

