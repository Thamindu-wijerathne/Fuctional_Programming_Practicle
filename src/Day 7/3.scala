import Day7two.calculateSquare

import scala.math.BigInt


object Day7three {
  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(num => BigInt(num).isProbablePrime(num))
  }


  def main(args:Array[String]): Unit = {
    var intputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var outputList = filterPrime(intputList)
    println(outputList)
  }
}