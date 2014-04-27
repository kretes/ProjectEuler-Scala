package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem12Test extends FlatSpec with ShouldMatchers {

  it should "have naturalswork for small problem" in {
    Problem12.naturalNumbers.take(10).toList should be ((1 to 10).toList)
  }

  it should "work for small problem" in {
    Problem12.solution(5) should be (28)
  }

  //4.7 -> 3.1 par
  it should "work for medium problem" in {
    Problem12.solution(200) should be (2031120)
  }

  //50(par)
  it should "work for medium 2 problem" in {
    Problem12.solution(350) should be (17907120)
  }

  //416 sec
  "A Problem12 Solution" should "return the value of the first triangle number to have over five hundred divisors" in {
    Problem12.solution(500) should be (76576500)
  }
}

