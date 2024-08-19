import scala.io.StdIn

object Day9Two {
  def checkNu(num: Int): Unit = {
    // Pattern matching with lambda functions
    val result = num match {
      case x if x == 0 => () => println("Negative/Zero")
      case x if x < 0 => () => println("Negative/Zero")
      case x if x % 2 == 0 => () => println("Even number")
      case _ => () => println("Odd number")
    }

    // Invoke the lambda function to print the result
    result()
  }

  def main(args: Array[String]): Unit = {
    println("Enter string:")
    val input = StdIn.readLine()
    val value = input.toInt
    checkNu(value)
  }
}
