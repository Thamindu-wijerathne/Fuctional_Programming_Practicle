import scala.io.StdIn.readLine

object Day8two{
  val categorize: Int => String = {
    case n if n % 3 == 0 && n % 5 == 0 => "Multiple of Both Three and Five"
    case n if n % 3 == 0 => "Multiple of Three"
    case n if n % 5 == 0 => "Multiple of Five"
    case _ => "Not a Multiple of Three or Five"
  }

  def main(args: Array[String]): Unit = {
    println("Please provide integer input :")
    val input = readLine().toInt

    val result = categorize(input)
    println(result)
  }
}