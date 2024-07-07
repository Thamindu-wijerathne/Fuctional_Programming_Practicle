  object p {
    def fib(n: Int): Int = n match {
      case 0 => 0
      case 1 => 1
      case x => fib(x - 1) + fib(x - 2)
    }

    def main(args: Array[String]): Unit = {
      var x = fib(5)
      println(s"$x")
    }
  }

