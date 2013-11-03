package euler

import java.math.BigDecimal

object Problem16 {
  def solution (base: Int, exponent: Int) = {
    new BigDecimal(Math.pow(base, exponent)).toString map { _.asDigit } reduce { _ + _ }
  }
}
