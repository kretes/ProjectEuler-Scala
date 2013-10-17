package euler

object Problem2 {
  def solution (highestFibonacci: Int): Int = {
    fibFrom(1, 2).takeWhile(_ < highestFibonacci).filter(_ % 2 == 0).sum
  }

  def fibFrom (a: Int, b: Int): Stream[Int] = {
    a #:: fibFrom(b, a + b)
  }
}
