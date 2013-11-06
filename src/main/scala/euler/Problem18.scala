package euler

object Problem18 {
  def maximumPathSum (triangle: Array[Array[Int]]): Int = {
    (triangle reduceRight ((top, bottom) => {
        var topIndex = 0
        (bottom sliding 2).toArray.foreach (pair => {
            top(topIndex) = top(topIndex) + pair.max
            topIndex += 1
        })
        top
      }
    )).max
  }
}
