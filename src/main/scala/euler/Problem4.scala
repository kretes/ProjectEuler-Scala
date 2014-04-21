package euler

object Problem4 {
  def palindromeProductOf(digits: Int):Int = {
    (for (a <- (2 to Math.pow(10,digits).toInt); b <- (2 to Math.pow(10,digits).toInt); if isPalindrome((a * b).toString)) yield a * b).max
  }

  def isPalindrome (x: String): Boolean = x == x.reverse

  def solution: Int = palindromeProductOf(3);
}
