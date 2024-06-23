  object p {
  def power(n:Int,m:Int):Int={ m match{
    case 0 => 1
    case _ => n*power(n,m-1)
  }

  }


    def main(args: Array[String]): Unit = {
      println(power(2,30))
    }
  }


