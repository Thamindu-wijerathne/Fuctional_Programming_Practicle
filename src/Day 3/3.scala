object day3three {
  def AverageMean(x: Int, y: Int): Unit = {
    var z = (x + y) / 2.0
    println(f"mean = $z%.2f")
  }

  def main(args : Array[String]): Unit = {
    var num1 = 5
    var num2 = 2

    AverageMean(num1, num2)
  }
}
