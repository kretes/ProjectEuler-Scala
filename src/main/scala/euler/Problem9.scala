package euler

object Problem9 {

  /**
   * Adapted from my C# Solution:
   *
   * public List<int> GetPythagoreanTripletWhoseSumEquals (int sumConstraint) {
   *     int aUpperBound,
   *         bUpperBound,
   *         cUpperBound,
   *         a = 3, aLowerBound = 3,
   *         b = 4, bLowerBound = 4,
   *         c = 5, cLowerBound = 5;
   *
   *     do {
   *         aUpperBound = aLowerBound * 2;
   *         bUpperBound = bLowerBound * 2;
   *         cUpperBound = cLowerBound * 2;
   *
   *         for (a = aLowerBound; a <= aUpperBound; a++) {
   *             for (b = bLowerBound; b <= bUpperBound; b++) {
   *                 for (c = cLowerBound; c <= cUpperBound; c++) {
   *                     if (areThePythagoreanTriple(a, b, c, sumConstraint)) {
   *                         return new List<int> { a, b, c };
   *                     }
   *                 }
   *             }
   *         }
   *
   *         aLowerBound = aUpperBound;
   *         bLowerBound = bUpperBound;
   *         cLowerBound = cUpperBound;
   *     } while ((a + b + c) < sumConstraint);
   *
   *     return new List<int>();
   * }
   *
   * @param sumConstraint Int
   * @return Option of Pythagorean Triple
   */
  def solution (sumConstraint: Int): Option[(Int, Int, Int)] = {

    def searchForPythagoreanTriple (candidate: (Int, Int, Int)): Option[(Int, Int, Int)] = {
      candidate match {
        case (lowerBoundA, lowerBoundB, lowerBoundC) if lowerBoundA + lowerBoundB + lowerBoundC <= sumConstraint => {
          val upperBoundA = lowerBoundA * 2
          val upperBoundB = lowerBoundB * 2
          val upperBoundC = lowerBoundC * 2

          for (
            a <- lowerBoundA to upperBoundA;
            b <- lowerBoundB to upperBoundB;
            c <- lowerBoundC to upperBoundC if isPythagoreanTriple((a, b, c), sumConstraint)
          ) {
            return Some((a, b, c))
          }

          searchForPythagoreanTriple(upperBoundA, upperBoundB, upperBoundC)
        }
        case _ => None
      }
    }

    searchForPythagoreanTriple(3, 4, 5)
  }

  /**
   * @param triple a set of 3 numbers to be tested for pythagorean triple-ness
   * @param sumConstraint also, they need to add up to the supplied sum
   * @return
   */
  def isPythagoreanTriple (triple: (Int, Int, Int), sumConstraint: Int): Boolean = {
    val aSquared = triple._1 * triple._1
    val bSquared = triple._2 * triple._2
    val cSquared = triple._3 * triple._3

    (aSquared + bSquared == cSquared) && (triple._1 + triple._2 + triple._3 == sumConstraint)
  }
}

