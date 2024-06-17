object all {
  def AreaOfDisk(radius : Double): Double = {
    val pi = math.Pi
    pi * radius * radius
  }

  def ConvertTemp(cel: Int): Double = {
    var far = Int
    cel * 1.8 + 32
  }

  def VolumeOfSphere(radius : Double): Double =  {
    val pi = math.Pi
    4 / 3 * pi * radius * radius * radius
  }

  def WholesaleCost(count : Int) : Double = {
    val coverPrice = 24.95
    val dis = 0.4
    var bookPrice = (coverPrice * (1 -dis)) * count

    val shippingCost = if (count > 50) {
      3 + (count - 50) * 0.75
    }
    else {
      3
    }

    bookPrice + shippingCost
  }

  def runningTime(easy : Int , tempo : Int): Int = {
    val easyPace : Int = 8
    val tempoPace : Int = 7

    easy * easyPace + tempo * tempoPace
  }

  def main(args: Array[String]): Unit = {
    var radius = 5;
    var area = AreaOfDisk(radius)
    println(f"Area of the disk (radius : $radius) : $area%.2f")

    var cel : Int = 35
    var far = ConvertTemp(cel)
    println(s"Temperature $cel C = $far")

    var volume = VolumeOfSphere(radius)
    println(f"Volume of the sphere $radius  = $volume%.2f")

    var copies : Int = 60
    var Price = WholesaleCost(copies)
    println(f"Wholesale cost for $copies copies : $Price%.2f")

    var time = runningTime(4, 3)
    println(s"Total running time : $time minutes")

  }
}


