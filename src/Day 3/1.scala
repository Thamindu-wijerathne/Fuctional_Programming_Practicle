object Day3one {
  def reverseString(x : String): String = {
    if(x.isEmpty) ""
    else {
      reverseString(x.tail) + x.head
    }
  }

  def check(x : String): String = {
    println(x.head)
    x
  }


  def main(args: Array[String]): Unit = {
    var input = "hellow"
    var result = reverseString(input)
    println(result)
    //check(input)
  }
}