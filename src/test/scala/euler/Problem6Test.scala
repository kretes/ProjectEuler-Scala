package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem6Test extends FlatSpec with ShouldMatchers {
  "A Problem6 Solution" should "return the correct sum of squares from 1 to 10" in {
    Problem6.sumOfTheSquaresFromOneTo(10) should be (385)
  }

  it should "return the correct square of sums from 1 to 10" in {
    Problem6.squareOfTheSumsFromOneTo(10) should be (3025)
  }

  it should "return the correct difference of squares and sums from 1 to 10" in {
    Problem6.differenceBetweenSquareOfSumsAndSumOfSquaresFromOneTo(10) should be (2640)
  }

  it should "return the correct difference of squares and sums from 1 to 100" in {
    Problem6.differenceBetweenSquareOfSumsAndSumOfSquaresFromOneTo(100) should be (25164150)
  }
}

