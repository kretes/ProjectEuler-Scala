package euler

import scala.annotation.tailrec

object Problem21 {
  def properDivisorsSum (n: Int): Int = {
    (1 until n).filter(n % _ == 0).sum
  }

  def solution (n: Int): Int = {

    @tailrec
    def buildAmicablePairsMap (candidate: Int, m: Map[Int, Boolean]): Map[Int, Boolean] = {
      if (m.contains(candidate))
        buildAmicablePairsMap(candidate + 1, m)
      else if (candidate >= n)
        m
      else {
        val amicable1 = properDivisorsSum(candidate)
        val amicable2 = properDivisorsSum(amicable1)

        if (candidate != amicable1 && amicable2 == candidate) {
          buildAmicablePairsMap(candidate + 1, m ++ Map(amicable1 -> true, amicable2 -> true))
        } else {
          buildAmicablePairsMap(candidate + 1, m.updated(candidate, false))
        }
      }
    }

    buildAmicablePairsMap(1, Map.empty).filter(_._2).keySet.sum
  }
}
