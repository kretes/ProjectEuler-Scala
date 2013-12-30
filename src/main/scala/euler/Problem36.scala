package euler

object Problem36 {

  def solution (limit: Int) = {
    def isPalindrome (s: String) = s == s.reverse
    def isDecimalPalindrome (n: Int) = isPalindrome(n.toString)
    def isBinaryPalindrome (n: Int) = isPalindrome(n.toBinaryString)

    (1 to limit)
      .filter(isDecimalPalindrome)
      .filter(isBinaryPalindrome)
      .sum
  }
}
