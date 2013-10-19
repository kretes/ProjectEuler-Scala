package euler

object Problem4 {
  def isPalindrome (x: String): Boolean = x == x.reverse

  def solution: Int =
    (for {
      a <- (1 to 999).reverse
      b <- (1 to 999).reverse
      c = a * b; if isPalindrome(c.toString)
    } yield c).max
}
