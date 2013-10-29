package euler

import scala.annotation.tailrec

object Problem12 {
  @tailrec
  def solution (n: Int, memo: Int = 1): Int = {
    val t = nthTriangularNumber(memo)
    val d = numDivisors(t)

    if (d > n) t
    else solution(n, memo + 1)
  }

  @tailrec
  def nthTriangularNumber (n: Int, acc: Int = 0): Int = {
    if (n == 0) acc
    else nthTriangularNumber(n - 1, acc + n)
  }

  def numDivisors (n: Int): Int = {
    val squareRoot = Math.sqrt(n).toInt
    var numDivisors = ((1 to squareRoot) map {
      case x if n % x == 0 => 2
      case _ => 0
    }).sum

    if (squareRoot * squareRoot == n) {
      numDivisors -= 1
    }

    numDivisors
  }
}
