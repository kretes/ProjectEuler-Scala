package euler


object Problem15 {
  def solution (i: Long): Long = {
    buildLattice(i)(i.toInt)(i.toInt)
  }

  def buildLattice (numSquares: Long): Array[Array[Long]] = {
    val numPoints = (numSquares + 1L).toInt
    val lattice = new Array[Array[Long]](numPoints)

    for (i <- 0 until numPoints) {
      lattice(i) = new Array[Long](numPoints)
      lattice(0)(i) = 1L
      lattice(i)(0) = 1L
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
