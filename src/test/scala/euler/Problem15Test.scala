package euler

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class Problem15Test extends FlatSpec with ShouldMatchers {
  "A Problem15 Solution" should "return the correct number of paths through a 1x1 lattice" in {
    Problem15.solution(1) should be (2)
  }

  it should "return the correct number of paths through a 2x2 lattice" in {
    Problem15.solution(2) should be (6)
  }

  it should "return the correct number of paths through a 20x20 lattice" in {
    Problem15.solution(20) should be (137846528820L)
  }
}

