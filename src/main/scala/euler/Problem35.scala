package euler
import euler.tools.ImplicitConversions._
import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

object Problem35 {
  def solution (upperBound: Long): Seq[Long] = {
    (2L until upperBound).filter(isCircularPrime)
  }

  private def isCircularPrime (l: Long): Boolean = {
    rotations(l.toString).forall(_.toLong.isPrime)
  }

  private def rotations(str: String): List[String] = {
    @tailrec
    def makeRotations (s: String, buff: ListBuffer[String] = ListBuffer(str)): List[String] = {
      val rotated = s.tail + s.head

      if (rotated != str) {
        makeRotations(rotated, buff += rotated)
      } else {
        buff.toList
      }
    }

    makeRotations(str)
  }
}
