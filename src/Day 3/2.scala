import scala.collection.mutable.ListBuffer

object day3two {
  def stringCheck(x : List[String]): Unit = {
    val longElements = ListBuffer[String]() // this function used to create mutable listbuffer
    for (element <- x) {
      var elementLen = element.length
      if (elementLen > 5) {
        // add elements to new list
        longElements += element
      }
    }

    // convert listbuffer to immutable list
    // listbuffer allows us to efficiently add and remove elements
    val resultList = longElements.toList
    println(s"Elements with length greater than 5 : $resultList")
  }

  def main(args: Array[String]): Unit = {
    val stringList = List("car", "van", "bicycle", "truck", "foot-cycle")
    stringCheck(stringList)
  }
}