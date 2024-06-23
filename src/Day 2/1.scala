object one {
  var i : Int = 2
  var j : Int = 2
  var m : Int = 5
  var n : Int = 5
  var k : Int = 2
  var f : Float = 12.0f
  var g : Float = 4.0f
  var c : Char = 'X'

  val resultA = k + 12 * m
  val resultB = m / j
  val resultC = n % j
  val resultD = m / j * j
  val resultE = f + 10 * 5 + g
  //val resultF = ++i * n
  //i = i + 1
  //val resultF = i * n

  def main(args: Array[String]): Unit = {
    println(s"k + 12 * m : $resultA")
    println(s"m / j : $resultB")
    println(s"n % j : $resultC")
    println(s"m / j * j : $resultD")
    println(s"f + 10 * 5 + g : $resultE")
    //println(s"++i * n : $resultF")
  }
}
