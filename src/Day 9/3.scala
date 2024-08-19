object NameFormatter {

  // Method to convert a string to upper case
  def toUpper(name: String): String = name.toUpperCase

  // Method to convert a string to lower case
  def toLower(name: String): String = name.toLowerCase

  // Method to format the name based on the provided formatting function
  def formatNames(name: String)(format: String => String): String = format(name)

  def main(args: Array[String]): Unit = {
    // Test inputs with specific formatting applied

    // "BENNY"
    println(formatNames("Benny")(toUpper))

    // "NIroshan" - First 2 letters upper case, rest lower case
    println(formatNames("Niroshan")(name => name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase))

    // "saman" - All lower case
    println(formatNames("Saman")(toLower))

    // "KumarA" - First and last letters upper case, rest lower case
    println(formatNames("Kumara")(name => name.substring(0, 1).toUpperCase + name.substring(1, name.length - 1).toLowerCase + name.substring(name.length - 1).toUpperCase))
  }
}
