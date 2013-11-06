package euler

object Problem18 {
  def maximumPathSum (triangle: Array[Array[Int]]): Int = {
    (triangle reduceRight {
      (top, bottom) => (bottom sliding 2).toArray.map { _.max } zip top map { case (t, b) => t + b }
    }).max
  }
}
