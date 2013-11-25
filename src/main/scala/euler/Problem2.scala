package euler

object Problem2 {
  import tools.NumberUtilities
  private val ints = new NumberUtilities[Int]

  def solution (highestFibonacci: Int): Int = {
    ints.fibonacci.takeWhile(_ < highestFibonacci).filter(_ % 2 == 0).sum
  }
}
