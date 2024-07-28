import scala.collection.mutable.ListBuffer

object Day6one {
  case class product(Id:Int , name:String, quantity:Int, price:Double)

  val products1 = ListBuffer(
    product(1, "toothBrush", 5, 125.00),
    product(2, "soap      ", 25, 55.00),
    product(3, "whiteBoard", 2, 1225.00),
    product(4, "book      ", 55, 250.00),
    product(5, "pen       ", 115, 20.00)
  )

  val products2 = ListBuffer(
    product(1, "toothBrush", 10, 125.50),
    product(2, "soap      ", 10, 55.00),
    product(3, "whiteBoard", 10, 1225.50),
    product(4, "book      ", 10, 250.00),
    product(5, "pen       ", 10, 20.50)
  )

  val products3 = ListBuffer[product]()

  def printProductByName(products: List[product]): Unit = {
    if(products.nonEmpty){
      val product = products.head
      //println(s"ID :  ${product.Id}\tName : ${product.name}\tQuantity : ${product.quantity}\tPrice : ${product.price}")
      println(s"Name : ${product.name}")
      printProductByName(products.tail)
    }
  }

  def printProduct(products: List[product]): Unit = {
    if(products.nonEmpty){
      val product = products.head
      println(s"ID :  ${product.Id}\tName : ${product.name}\tQuantity : ${product.quantity}\tPrice : ${product.price}")
      //println(s"Name : ${product.name}")
      printProduct(products.tail)
    }
  }

  def calculateValue(products: List[product]): Double = {
    if(products.isEmpty) {
      0.0
    }
    else {
      val product = products.head
      product.price * product.quantity + calculateValue(products.tail)
      }
    }

  def emptyProduct(products: List[product]): Unit = {
    //checks total value of the inventory if it has no value then
    //it is empty
    if(calculateValue(products) > 0){
      println("is Not Empty");
    }
    else {
      println("is Empty");
    }
  }

  def mergeProduct(products1: List[product], products2: List[product]): Unit = {
    if(products1.nonEmpty && products2.nonEmpty){
      val temp1 = products1.head
      val temp2 = products2.head
      products3 += product(temp1.Id, temp1.name, temp1.quantity + temp2.quantity, if(temp1.price > temp2.price) temp1.price else temp2.price)
//      println("mergeProduct")
//      products3 :+ product(1, "batman", 1 ,1)
      mergeProduct(products1.tail, products2.tail)
    }
  }

  var x = 0
  def checkProduct(products: List[product], i: Int): Unit = {

    if(products.nonEmpty){
      var product = products.head
      if(product.Id == i) {
        x = 1
      }
      else {
        checkProduct(products.tail, i)
      }
    }
    0
  }


  def main(args: Array[String]): Unit = {
    //Print products by name
    printProductByName(products1.toList)

    //calculate value
    val temp = calculateValue(products1.toList) : Double
    println(s"\nTotal value Products1 : $temp")

    //Check emptyness in Inventory
    emptyProduct(products1.toList)

    //Merging two inventories
    println("After merging two products")
    mergeProduct(products1.toList, products2.toList)
    printProduct(products3.toList)

    //check the product
    checkProduct(products1.toList, 6)

    if(x==1) println("Available") else println("Unavailble")
  }
}