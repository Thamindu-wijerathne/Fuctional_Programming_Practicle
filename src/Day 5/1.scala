import scala.io.StdIn
import scala.collection.mutable.ArrayBuffer

object Day5one {
  // Creating mutable array
  var products = ArrayBuffer[String]();

  def getProductList(): Unit = {
    println("Enter product name : ")
    var input = StdIn.readLine();

    if(input == "done"){

    }
    else {
      products += input;
      getProductList();
    }
  }

  def printProductList(products : Array[String]): Unit = {
    if(products.length >0){
      println(products.head)
      printProductList(products.tail)
    }
  }

  def getTotalProducts(products : Array[String]): Unit = {
    var count: Int = products.length;
    println(s"Total number of products : $count")
  }

  def main(args:Array[String]):Unit= {
    getProductList();
    printProductList(products.toArray)  //converts ArrayBuffer into Array
    getTotalProducts(products.toArray)
  }
}