package euler

object Problem1 {
  def solution(limit: Int): Int = {
    (1 to limit-1).filter(number => number % 3 ==0 || number % 5 ==0).sum
  }
}
