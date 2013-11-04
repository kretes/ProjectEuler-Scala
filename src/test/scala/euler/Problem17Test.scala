package euler

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.prop.TableDrivenPropertyChecks

class Problem17Test extends FlatSpec with TableDrivenPropertyChecks with ShouldMatchers {
  behavior of "A Problem17 Solution"

  val inputsAndExpectedOutputs = Table(
    ("input", "expectedOutput"),
    (0, "zero"),
    (1, "one"),
    (2, "two"),
    (3, "three"),
    (4, "four"),
    (5, "five"),
    (6, "six"),
    (7, "seven"),
    (8, "eight"),
    (9, "nine"),
    (10, "ten"),
    (11, "eleven"),
    (12, "twelve"),
    (13, "thirteen"),
    (14, "fourteen"),
    (15, "fifteen"),
    (16, "sixteen"),
    (17, "seventeen"),
    (18, "eighteen"),
    (19, "nineteen"),
    (20, "twenty"),
    (21, "twenty-one"),
    (27, "twenty-seven"),
    (30, "thirty"),
    (38, "thirty-eight"),
    (40, "forty"),
    (42, "forty-two"),
    (50, "fifty"),
    (53, "fifty-three"),
    (60, "sixty"),
    (64, "sixty-four"),
    (70, "seventy"),
    (75, "seventy-five"),
    (80, "eighty"),
    (86, "eighty-six"),
    (90, "ninety"),
    (99, "ninety-nine"),
    (100, "one hundred"),
    (101, "one hundred and one"),
    (256, "two hundred and fifty-six"),
    (342, "three hundred and forty-two"),
    (978, "nine hundred and seventy-eight"),
    (999, "nine hundred and ninety-nine"),
    (1000, "one thousand"),
    (1298, "one thousand two hundred and ninety-eight"),
    (9999, "nine thousand nine hundred and ninety-nine"),
    (10245, "ten thousand two hundred and forty-five"),
    (101573, "one hundred and one thousand five hundred and seventy-three"),
    (999999, "nine hundred and ninety-nine thousand nine hundred and ninety-nine"),
    (1000000, "one million"),
    (1000205, "one million two hundred and five"),
    (1389442, "one million three hundred and eighty-nine thousand four hundred and forty-two")
  )

  forAll (inputsAndExpectedOutputs) { (input: Int, expectedOutput: String) =>
    it should s"be able to convert $input to $expectedOutput" in {
      Problem17.toText(input) should be (expectedOutput)
    }
  }

  it should "return the correct number of total letters used from 1 to 5" in {
    Problem17.solution(5) should be (19)
  }

  it should "return the correct number of total letters used from 1 to 1000" in {
    Problem17.solution(1000) should be (21124)
  }
}
