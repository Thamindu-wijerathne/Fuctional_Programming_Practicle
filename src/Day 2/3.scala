object three {
  val tax : Double = 0.12

  def SalaryAmout(normal : Int, OT : Int) : Double = {
    var normalVal = normal * 250
    var OTVal = OT * 85

    ( normalVal + OTVal ) * (1 - tax)  * 4 //multiple by 4 because month has 4 weeks
  }

  def main(args : Array[String]): Unit = {
    var salary = SalaryAmout(40 , 30)

    println(s"Total salary : $salary")
  }
}