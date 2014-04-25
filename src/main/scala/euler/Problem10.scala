package euler

import scala.annotation.tailrec


object Problem10 {

  implicit def int2Long(x: Int): Long = x.toLong
  //350 sec

  def extendUpTo(value: Long, primeMultipliers: Seq[(Long, Long)]): Seq[(Long, Long)] =
    primeMultipliers.map((tuple:(Long,Long)) => if (tuple._2 >= value) tuple else (tuple._1, value + tuple._1 - (value % tuple._1)))

  def calculatePrimes(start: Long, primeMultipliers: Seq[(Long,Long)]) : Stream[Long] = {
    if ( primeMultipliers.find(_._2 < start).isDefined) calculatePrimes(start,extendUpTo(start,primeMultipliers))
    else if ( primeMultipliers.find(_._2 == start).isDefined) calculatePrimes(start+1,primeMultipliers)
    else start #:: calculatePrimes(start+1,primeMultipliers :+ (start,start))
  }

  val primes = 2 #:: calculatePrimes(3, Vector((2,2)))

  def solution (limit: Long): Long = primes.takeWhile(_ < limit).sum


}
