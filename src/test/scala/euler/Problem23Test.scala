package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem23Test extends FlatSpec with ShouldMatchers {
  "A Problem23 solution" should """|find the sum of all the positive
                                   |integers which cannot be written
                                   |as the sum of two abundant numbers.""".stripMargin in {
    Problem23.solution should be (4179871)
  }
}
