package euler

object Problem13 {
  def solution (numbers: List[String]): String = {
    (numbers map BigInt.apply reduce { _ + _ }).toString().substring(0, 10)
  }
}
