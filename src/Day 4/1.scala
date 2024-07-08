
object q1{
  var items=Array("Chocolate","Toffee","Biscuits","Soap","ToothPaste")
  var qty=Array(100,150,50,30,15)

  def displayInventory(items:Array[String],qty:Array[Int]):Unit={
    if(items.length>0 && qty.length>0){
      println(items.head+"\t"+qty.head)
      displayInventory(items.tail,qty.tail)
    }
  }
  def restockItem(item:String,newQty:Int):Unit={(items.indexOf(item)) match{
    case -1 => println("No Item Found")
    case x  => qty(x)+=newQty;println("Quantity has been updated new Quantity:"+items(x)+" : "+qty(x))
  }
  }
  def checkStockAvailability(item:String,req:Int):Int={
    (items.indexOf(item)) match{
      case -1 => -1
      case x => qty(x)>=req match{
        case true => x
        case false => -2
      }
    }
  }
  def subFromStock(index:Int,req:Int):Unit= qty(index)-=req

  def sellItem(item:String,req:Int):Unit={
    checkStockAvailability(item,req) match{
      case -1 => println("No Item Found")
      case -2 => println("Stock is not enough")
      case x => subFromStock(x,req);println("Stock updated")
    }
  }

  def main(args:Array[String]):Unit={

    displayInventory(items,qty)
    restockItem("Chocolate",100)
    sellItem("Biscuits",25)
    displayInventory(items,qty)

  }
}
