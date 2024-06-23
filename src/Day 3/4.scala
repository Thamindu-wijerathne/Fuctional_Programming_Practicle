object day3four {
  def sumEven(x : List[Int]): Unit = {
    var sum = 0

    for (element <- x) {
      if(element % 2 == 0){
        sum += element
      }
    }

    println(s"Sum of $sum")
  }


  def main(args : Array[String]) = {
    var numList = List(1, 2 , 3, 4, 5, 6, 7, 8, 9)
    sumEven(numList)
  }
}