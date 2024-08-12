import scala.io.StdIn.readLine

object Day8two {
  def matching(i: Int): Unit = i match {
    case x if((x % 3 == 0) && (x % 5 == 0)) => println("multiple of both three and five")
    case x if(x % 5 == 0) => println("multiple of five")
    case x if( x % 3 == 0) => println("multiple of three")
    case _ => println("NOT multiple of both three and five")

  }


  def main(args: Array[String]): Unit = {
    println("Enter your number :")
    val userinput = readLine()
    val num = userinput.toInt
    matching(num)


  }
}