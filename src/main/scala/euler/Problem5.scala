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
    val listOfGrouppedPrimeFactors: IndexedSeq[Map[Factor, Count]] = (2 to x.toInt).map(primeFactorsGroupped(_))
    val uniquePrimeFactors: Map[Factor, Count] = mergeToMap(listOfGrouppedPrimeFactors)
    uniquePrimeFactors.map(entry => Math.pow(entry._1.factor,entry._2.count)).product.toLong ;
  }


  def mergeToMap(listOfGrouppedPrimeFactors: IndexedSeq[Map[Problem5.Factor, Problem5.Count]]): Map[Problem5.Factor, Problem5.Count] = {
    listOfGrouppedPrimeFactors.reduce(merge)

  }

  def merge(histogram1: Map[Factor, Count], histogram2: Map[Factor, Count]): Map[Factor, Count] = {
    val keys = histogram1.keySet ++ histogram2.keySet
    val set: Set[(Factor, Count)] = for(key <- keys) yield (key,new Count(Math.max(histogram1.get(key).getOrElse(new Count(0)).count, histogram2.get(key).getOrElse(new Count(0)).count)))
    set.toMap
//
//
//    val histograms: List[(Factor,Count)] = histogram1.toList ++ histogram2.toList
//    val groupByFactor: Map[Factor, List[(Factor, Count)]] = histograms.groupBy(_._1)
//    val values: Map[Factor, List[Count]] = groupByFactor.mapValues(list => list.map(_._2))
//    val grouppedByFactor: Map[Factor, Count] = values.mapValues(list => new Count(list.map(_.count).max))
//    grouppedByFactor
  }
}
