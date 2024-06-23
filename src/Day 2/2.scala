object two {
  var a : Int = 2
  var b : Int = 3
  var c : Int = 4
  var d : Int = 5
  var k : Float = 4.3f

  def main(args : Array[String]) = {
    b = b - 1
    //in print we cannot do prefix
    println(b * a + c * d)            // --b * a + c * d--
    d = d - 1
    //neither postfix

    println(a)                        // a++
    a = a + 1

    // there is not a g in these quection
    //println(-2 * (g - k ) + c)

    //println(c = c ++)

    //println(c = ++c * a++)
  }
}