object four {
  val PerformCost : Int = 500

  def tot(TicketPrice1 : Double, TicketPrice2 : Double, TicketPrice3 : Double): Double = {
    var pure_profit1: Double = profit(TicketPrice1)           //ticket 20
    var pure_profit2: Double = profit(TicketPrice2)           //ticekt 15
    var pure_profit3: Double = profit(TicketPrice3)           //ticekt 10

    var profitable_ticket = max(pure_profit1, pure_profit2, pure_profit3)

    profitable_ticket
  }

  def max(a: Double, b: Double, c: Double): Double = {
    if (a >= b && a >= c) 20
    else if (b >= a && b >= c) 15
    else 10
  }


  def profit(value : Double): Double = value match{
    case x if x==20.00 => highPrice()
    case x if x==15.00 => averagePrice()
    case x if x==10.00 => lowPrice()

  }

  def highPrice(): Double = {
    20.00 * 100 - 3 * 100
  }

  def averagePrice(): Double = {
    15.00 * 120 - 3 * 120
  }

  def lowPrice(): Double = {
    10.00 * 140 - 3 * 140
  }

  def main(arg : Array[String]): Unit = {
    var money1 : Double = tot(20.00, 15.00, 10.00)

    println(s"Most profutable ticket price is : $money1")
  }
}