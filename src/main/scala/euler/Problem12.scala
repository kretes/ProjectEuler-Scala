package euler

import scala.annotation.tailrec


object Problem12 {

  def getTriangleNumbers(previous: Int, toAdd: Int):Stream[Int] = (previous + toAdd) #:: getTriangleNumbers(previous + toAdd, toAdd + 1)

  val triangleNumbers:Stream[Int] = 1 #:: getTriangleNumbers(1,2)

  val naturalNumbers:Stream[Int] = 1 #:: naturalNumbers.scanLeft(2)((a,b) => a + 1)

  def divisors(number: Int) = (1 to number/2).par.filter(number % _ == 0).size

  def countDivisors(number: Int): Int = divisors(number)

  def solution (divisorsCount: Int): Int = {
    triangleNumbers.find(triangle => {countDivisors(triangle) >= divisorsCount}).getOrElse(0)
  }

}
