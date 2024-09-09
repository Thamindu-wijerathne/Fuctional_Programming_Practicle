object Day10one {
  class Rational(n: Int, d: Int) {
    // Reduce the rational number by finding the greatest common divisor
    private val gcdValue: Int = gcd(n.abs, d.abs)
    val numer: Int = n / gcdValue
    val denom: Int = d / gcdValue

    // Method to negate the rational number
    def neg: Rational = new Rational(-numer, denom)

    // Helper function to calculate the greatest common divisor
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    override def toString: String = s"$numer/$denom"
  }

  def main(args: Array[String]): Unit =  {
    // Example usage:
    val x = new Rational(3, 4)
    val negX = x.neg 
    println(negX)

  }
}