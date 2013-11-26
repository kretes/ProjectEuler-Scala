package euler
import euler.tools.NumberUtilities

object Problem25 {
  val bigInts = new NumberUtilities[BigInt]

  def nthFibonacciTermWithDigitLength (i: Int): Int = {
    val minimumValue = BigInt(10).pow(i - 1)
    // + 1 because the next term is the first one with the desired digit length
    bigInts.fibonacci.takeWhile(_ < minimumValue).length + 1
  }
}
