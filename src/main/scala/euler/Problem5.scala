package euler

import scala.collection.immutable.Range.Inclusive
import scala.collection.immutable.IndexedSeq

object Problem5 {

  case class Count(val count:Long) extends AnyVal

  case class Factor(val factor:Long) extends AnyVal

  def primeFactorsGroupped(number: Int) = {
    Problem3.primeFactorsOf(number).groupBy(factor => factor).map(entry => (new Factor(entry._1), new Count(entry._2.size.toLong)))
  }

  def solution (x: Long) : Long = {
    val listOfGrouppedPrimeFactors: Seq[Map[Factor, Count]] = (2 to x.toInt).map(primeFactorsGroupped(_))
    val uniquePrimeFactors: Map[Factor, Count] = listOfGrouppedPrimeFactors.reduce(merge)
    uniquePrimeFactors.map(entry => Math.pow(entry._1.factor,entry._2.count)).product.toLong ;
  }

  def max(option1: Option[Long], option2: Option[Long]) = Math.max(option1.getOrElse(0L), option2.getOrElse(0L))

  def merge(histogram1: Map[Factor, Count], histogram2: Map[Factor, Count]): Map[Factor, Count] = {
    val keys = histogram1.keySet ++ histogram2.keySet
    val set: Set[(Factor, Count)] = for(key <- keys) yield (key,new Count(max(histogram1.get(key).map(_.count), histogram2.get(key).map(_.count))))
    set.toMap
  }

}
