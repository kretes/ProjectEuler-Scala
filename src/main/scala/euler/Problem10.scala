package euler

import scala.annotation.tailrec
import scala.collection.GenSeq


object Problem10 {

  //350 sec - prime fac
  //644 naive erastothen....
  //???

  def extendUpTo(value: Long, primeMultipliers: GenSeq[(Long, Long)]): GenSeq[(Long, Long)] =
    primeMultipliers.map((tuple:(Long,Long)) => if (tuple._2 >= value) tuple else
      (tuple._1, value + (tuple._1 - (value % tuple._1)) % tuple._1))


  def calculatePrimes(max:Long,start:Long, primeMultipliers: GenSeq[(Long,Long)]) : GenSeq[(Long,Long)] = {
    if( start % 10000 == 0) println(s"for $start we have ${primeMultipliers.size} at ${System.currentTimeMillis()}")
    if (start == max) primeMultipliers
    else if (primeMultipliers.find(_._2 == start).isDefined) calculatePrimes(max, start + 1, primeMultipliers)
    else if (primeMultipliers.find(_._2 < start).isDefined) calculatePrimes(max, start, extendUpTo(start, primeMultipliers))
    else calculatePrimes(max, start + 1, primeMultipliers :+(start, start))
  }



  def solution (limit: Long): Long = calculatePrimes(limit.toLong,3, Vector((2L,2L))).map(_._1).sum


}
