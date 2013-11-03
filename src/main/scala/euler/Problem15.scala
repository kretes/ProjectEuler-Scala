package euler


object Problem15 {
  import scala.language.implicitConversions

  implicit def long2Int (long: Long) = long.toInt
  implicit def int2Long (int: Int) = int.toLong

  def solution (i: Long): Long = {
    buildLattice(i)(i)(i)
  }

  def buildLattice (numSquares: Long): Array[Array[Long]] = {
    val numPoints = numSquares + 1
    val lattice = new Array[Array[Long]](numPoints)

    for (i <- 0 until numPoints) {
      lattice(i) = new Array[Long](numPoints)
      lattice(0)(i) = 1
      lattice(i)(0) = 1
    }

    for (row <- 1 until numPoints) {
      for (col <- 1 until numPoints) {
        val prevCol = col - 1
        val prevRow = row - 1
        lattice(row)(col) = lattice(row)(prevCol) + lattice(prevRow)(col)
      }
    }

    lattice
  }
}
