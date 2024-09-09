object Day10five {
    def countLetterOccurrences(words: List[String]): Int = {
      // Step 1: Use map to transform the words into their respective lengths
      val wordLengths = words.map(_.length)

      // Step 2: Use reduce to sum the lengths of all words
      val totalLetters = wordLengths.reduce(_ + _)

      totalLetters
    }

    def main(args: Array[String]): Unit = {
      // Example input
      val words = List("apple", "banana", "cherry", "date")

      // Call the function and print the result
      val totalCount = countLetterOccurrences(words)
      println(s"Total count of letter occurrences: $totalCount")
  }

}