package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Problem18Test extends FlatSpec with ShouldMatchers {
  val smallTriangle = Array(
    Array(3),
    Array(7, 4),
    Array(2, 4, 6),
    Array(8, 5, 9, 3)
  )

  "A Problem18 Solution" should "be able to correctly find the maximum path sum of a small triangle of numbers" in {
    Problem18.maximumPathSum(smallTriangle) should be (23)
  }

  val largeTriangle = Array(
    Array(75),
    Array(95, 64),
    Array(17, 47, 82),
    Array(18, 35, 87, 10),
    Array(20,  4, 82, 47, 65),
    Array(19,  1, 23, 75,  3, 34),
    Array(88,  2, 77, 73,  7, 63, 67),
    Array(99, 65,  4, 28,  6, 16, 70, 92),
    Array(41, 41, 26, 56, 83, 40, 80, 70, 33),
    Array(41, 48, 72, 33, 47, 32, 37, 16, 94, 29),
    Array(53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14),
    Array(70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57),
    Array(91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48),
    Array(63, 66,  4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31),
    Array( 4, 62, 98, 27, 23,  9, 70, 98, 73, 93, 38, 53, 60,  4, 23)
  )

  it should "be able to correctly find the maximum path of a larger triangle of numbers" in {
    Problem18.maximumPathSum(largeTriangle) should be (1074)
  }
}
