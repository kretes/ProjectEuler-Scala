package euler

import scala.collection.mutable

object Problem11 {
  def solution (grid: Array[Array[Int]]): Int = {
    def multiplication (x: Int, y: Int): Int = x * y

    var products = new mutable.ListBuffer[Int]

    for (
      r <- 0 until 16;
      c <- 0 until 16
    ) {
      val grid4x4 = Array(
        Array(grid(r + 0)(c + 0), grid(r + 0)(c + 1), grid(r + 0)(c + 2), grid(r + 0)(c + 3)),
        Array(grid(r + 1)(c + 0), grid(r + 1)(c + 1), grid(r + 1)(c + 2), grid(r + 1)(c + 3)),
        Array(grid(r + 2)(c + 0), grid(r + 2)(c + 1), grid(r + 2)(c + 2), grid(r + 2)(c + 3)),
        Array(grid(r + 3)(c + 0), grid(r + 3)(c + 1), grid(r + 3)(c + 2), grid(r + 3)(c + 3))
      )

      for (outer <- 0 until 4) {
        products += (for (inner <- 0 until 4) yield grid4x4(outer)(inner)) reduce multiplication
        products += (for (inner <- 0 until 4) yield grid4x4(inner)(outer)) reduce multiplication
      }

      products += (for (diagonal <- 0 until 4) yield grid4x4(diagonal)(diagonal)) reduce multiplication
      products += (for (diagonal <- 0 until 4) yield grid4x4(diagonal)(Math.abs(diagonal - 3))) reduce multiplication
    }

    products.max
  }
}
