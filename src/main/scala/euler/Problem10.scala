package euler

import scala.annotation.tailrec
import scala.collection.GenSeq


object Problem10 {

  //350 sec

  def extendUpTo(value: Long, primeMultipliers: GenSeq[(Long, Long)]): GenSeq[(Long, Long)] =
    primeMultipliers.map((tuple:(Long,Long)) => if (tuple._2 >= value) tuple else (tuple._1, value + tuple._1 - (if (value % tuple._1 == 0) tuple._1 else value % tuple._1)))

  def calculatePrimes(start: Long, primeMultipliers: GenSeq[(Long,Long)]) : Stream[Long] = {
    if ( primeMultipliers.find(_._2 == start).isDefined) calculatePrimes(start+1,primeMultipliers)
    else if ( primeMultipliers.find(_._2 < start).isDefined) calculatePrimes(start,extendUpTo(start,primeMultipliers))
    else start #:: calculatePrimes(start+1,primeMultipliers :+ (start,start))
  }

  val primes = 2 #:: calculatePrimes(3, Vector((2L,2L)))

  def solution (limit: Long): Long = primes.takeWhile(_ < limit).sum


}
