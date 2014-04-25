package euler

import scala.annotation.tailrec
import scala.collection.GenSeq


object Problem10 {

  def solution (limit: Long): Long = {
    Problem7.primesFrom(2).takeWhile(_ < limit).sum
  }

  // not that fast:

  @tailrec
  def getPrimes(primes: Vector[Long], sieve: Vector[Long], limit: Long): Vector[Long] = {
//    println(s"have $primes and sieve $sieve")
    val nextSieve = getNextSieve(sieve, primes.head,limit)
    if(nextSieve.headOption.isDefined)
      getPrimes(nextSieve.head +: primes,nextSieve, limit)
    else
      primes
  }


  def getNextSieve(sieve: Vector[Long], prime: Long, limit: Long):Vector[Long] = {
    sieve diff (prime to(limit,prime))
  }



  def getPrimes(limit:Long):Vector[Long] = {
    val numbers = (3L to limit).toVector
    getPrimes(Vector(2L),numbers,limit)
  }


}
