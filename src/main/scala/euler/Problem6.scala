package euler

object Problem6 {
  def square (x: Int): Int = x * x

  def sumOfTheSquaresFromOneTo (x: Int): Int = (1 to x map square).sum

  def squareOfTheSumsFromOneTo (x: Int): Int = square((1 to x).sum)

  def differenceBetweenSquareOfSumsAndSumOfSquaresFromOneTo (x: Int): Int =
    squareOfTheSumsFromOneTo(x) - sumOfTheSquaresFromOneTo(x)
}

