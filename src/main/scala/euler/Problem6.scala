package euler

object Problem6 {
  def sum (x: Int, y: Int): Int =
    x + y

  def square (x: Int): Int =
    x * x

  def sumOfTheSquaresFromOneTo (x: Int): Int =
    1 to x map square reduce sum

  def squareOfTheSumsFromOneTo (x: Int): Int =
    square(1 to x reduce sum)

  def differenceBetweenSquareOfSumsAndSumOfSquaresFromOneTo (x: Int): Int =
    squareOfTheSumsFromOneTo(x) - sumOfTheSquaresFromOneTo(x)
}

