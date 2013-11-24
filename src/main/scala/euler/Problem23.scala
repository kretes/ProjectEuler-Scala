package euler

import scala.collection.mutable
import scala.annotation.tailrec

object Problem23 {
  def solution: Int = {
    val limit = 28123
    val abundantNumbers = mutable.Set.empty[Int]

    @tailrec
    def sumOfNonAbundantSums (candidate: Int, currentSum: Int): Int = {
      if (candidate >= limit)
        currentSum
      else {
        if (isAbundant(candidate)) {
          abundantNumbers += candidate
        }

        if (! (abundantNumbers.map { candidate.- } exists { abundantNumbers.contains })) {
          sumOfNonAbundantSums(candidate + 1, currentSum + candidate)
        } else {
          sumOfNonAbundantSums(candidate + 1, currentSum)
        }
      }
    }

    sumOfNonAbundantSums(candidate = 1, currentSum = 0)
  }

  def isAbundant (n: Int): Boolean = {
    import euler.Problem21.properDivisorsSum
    properDivisorsSum(n) > n
  }
}
