

object Day7two {
  def calculateSquare(numbers : List[Int]): List[Int] = {numbers.map(num => num * num)}
  def main(args: Array[String]): Unit = {
    var intputList = List(1, 2, 3, 4, 5)
    println(calculateSquare(intputList))
  }
}