package euler

object Problem30 {
  def solution: Int = {
    (2 to 1000000).filter(d => d == d.toString.map(c => Math.pow(c.asDigit, 5)).sum).sum
  }
}
