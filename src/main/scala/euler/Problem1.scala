package euler

object Problem1 {
  def solution(limit: Int): Int = {
    (1 until limit).filter(x => x % 3 == 0 || x % 5 == 0).sum
  }
}
