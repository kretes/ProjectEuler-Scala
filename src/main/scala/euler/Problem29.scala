package euler

object Problem29 {
  def solution (a: Int, b: Int): Set[BigInt] = {
    (for { base <- a to b; exponent <- a to b } yield BigInt(base).pow(exponent)).toSet
  }
}
