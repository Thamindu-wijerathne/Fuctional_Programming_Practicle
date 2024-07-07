import scala.io.StdIn

object Day4Two {
  def checkNu(num : Int): Unit = {
    num match {
      case x if x == 0  => println ("Negative/Zero")
      case x if x < 0  => println ("Negative/Zero")
      case x if x % 2 == 0 => println("Even number")
      case x if x % 2 == 1 => println("Odd number")
    }
  }
  def main(args: Array[String]): Unit = {
    println("Enter string :")
    var Input = StdIn.readLine()
    var value = Input.toInt
    checkNu(value)
  }
}
