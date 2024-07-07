import scala.collection.mutable.Map

object Day4One {
  var Items = Map("soap" -> 25, "snack" -> 30, "pen" -> 15, "book" -> 5, "bread" -> 8)

  def DisplayInventory(): Unit = {
    Items.keys.foreach{i=>println(i + " : " + Items(i))}

  }

  def RestockItem(name : String, quantity : Int): Unit = {
    if (Items.contains(name)) {
      Items(name) = Items(name) + quantity
      var temp = Items(name)
      println(s"New value of $name : $temp")
    }
    else {
      println("Item not in the inventory")
    }
  }

  def SellItem(name : String, quantity : Int): Unit = {
    if (Items.contains(name)) {
      if (Items(name) - quantity > 0) {
        Items(name) = Items(name) - quantity
        var temp = Items(name)
        println(s"New value of $name : $temp")

      }
      else {
        println(s"Not enough $name to sale")
      }

    }
    else {
      println("Item not in the inventory")
    }
  }

  def main(args: Array[String]): Unit = {
    DisplayInventory()
    RestockItem("soap", 4)
    SellItem("book", 4)
    SellItem("bread", 20)
  }
}