object day3three {
  def arithmeticMean(num1: Int, num2: Int): Double = {
    val mean = (num1.toDouble + num2.toDouble) / 2.0
    BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }


  def main(args : Array[String]): Unit = {
    var num1 = 1
    var num2 = 2

    var mean = arithmeticMean(num1 , num2)
    println(f"$mean%.2f")
  }
}
