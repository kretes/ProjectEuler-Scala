package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem21Test extends FlatSpec with ShouldMatchers {


  it should "evaluate the sum of all amicable numbers under 10,000" in {
    Problem21.solution(10000) should be (31626)
  }
}
