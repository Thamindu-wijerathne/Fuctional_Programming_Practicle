import scala.io.StdIn.readLine

object Day9one {
  val in2: Int => Double =(x:Int) => x * 0.02;
  val in4: Int => Double =(x:Int) => x * 0.04;
  val in3_5: Int => Double =(x:Int) => x * 0.035;
  val in6_5: Int => Double =(x:Int) => x * 0.065;

  def interest(x:Int): Double = x match {
    case x if(x<20000 && x>0) => in2(x);
    case x if(x<200000 && x>20000) => in4(x);
    case x if(x<2000000 && x>200000) => in3_5(x);
    case x if(x<20000000 && x>2000000) => in6_5(x);
  }

  def printIntersert(x: Int): Unit = {
    val int = interest(x)
    print(int)
  }

  def main(args: Array[String]): Unit = {
    print("Enter your deposit amount : ")
    var depositAmount = readLine().toInt;
    println()
    println("Thi is your interest : ")
    printIntersert(depositAmount)
  }
}