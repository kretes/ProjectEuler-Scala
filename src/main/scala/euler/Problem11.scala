package euler


object Problem11 {

  def positionsAround(startx: Int, starty: Int, xSize: Int, ySize: Int, howMany: Int) = {
    List(
      (for (distance <- (0 to howMany-1); x=startx-distance; if(x>=0)) yield (x,starty)),
      (for (distance <- (0 to howMany-1); y=starty-distance; if(y>=0)) yield (startx,y)),
      (for (distance <- (0 to howMany-1); y=starty-distance; if(y>=0); x=startx-distance; if(x>=0)) yield (x,y)),
      (for (distance <- (0 to howMany-1); y=starty+distance; if(y<ySize); x=startx-distance; if(x>=0)) yield (x,y)))
  }

  def productOfElementsAt(grid: Array[Array[Int]], positions: Seq[(Int, Int)]) = positions.map(position => grid(position._1)(position._2)).product


  def solution (grid: Array[Array[Int]]): Int = {
    (for (x <- (0 to grid.size-1); y <- (0 to grid(x).size -1); positions <- positionsAround(x,y,grid.size,grid(x).size,4))
      yield productOfElementsAt(grid,positions)).max
  }
}
