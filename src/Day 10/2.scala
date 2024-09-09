object Day10two {
  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")

    private val gcdValue: Int = gcd(n.abs, d.abs)
    val numer: Int = n / gcdValue
    val denom: Int = d / gcdValue

    //this is current object and that is parameter object


    def this(n: Int) = this(n, 1)

    // Method to negate the rational number
    def neg: Rational = new Rational(-numer, denom)

    // Method to subtract two rational numbers
    def sub(that: Rational): Rational = {
      val newNumer = this.numer * that.denom - that.numer * this.denom
      val newDenom = this.denom * that.denom
      new Rational(newNumer, newDenom)
    }

    // Helper function to calculate the greatest common divisor
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    override def toString: String = s"$numer/$denom"
  }

  def main(args: Array[String]): Unit =  {
    // Example usage:
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    // Calculate y - z
    val result1 = y.sub(z)

    // Calculate x - (y - z)
    val result2 = x.sub(result1)

    println(result2)  // This will print the result of x - (y - z)
  }
}




