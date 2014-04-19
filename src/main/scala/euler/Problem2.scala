package euler

object Problem2 {

  val fibonacciStream: Stream[Int] = 1 #:: fibonacciStream.scanLeft(1)(_ + _)

  def fibonacciUpTo(highest: Int) : Stream[Int]= fibonacciStream.takeWhile(_ < highest)

  def solution (highestFibonacci: Int): Int = fibonacciUpTo(highestFibonacci).filter(_ % 2 == 0).sum
}
