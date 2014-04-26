package euler

import scala.annotation.tailrec
import scala.collection.GenSeq
import scala.collection.immutable.Range.Inclusive


object Problem10 {

  def calculateSieveUpTo(limit: Int) = {
    val sieve = Array.fill(limit+1)(true)
    sieve(0) = false
    sieve(1) = false
    var current = 2;
    while(current<limit) {
      if(sieve(current) == true) {
        val range: Inclusive = (2 * current) to(limit,current)
        range.foreach(sieve(_) = false)
      }
      current = current +1
    }
    sieve
  }

  def solution (limit: Int): Long = {
    val sieve = calculateSieveUpTo(limit);

    val primes: Array[Long] = sieve.zipWithIndex.filter(_._1 == true).map(_._2.toLong)

    primes.sum
  }

}
