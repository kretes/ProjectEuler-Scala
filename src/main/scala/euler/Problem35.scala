package euler
import euler.tools.ImplicitConversions._

object Problem35 {
  def solution (upperBound: Long): Seq[Long] = {
    (2L until upperBound).filter(_.isCircularPrime)
  }
}
