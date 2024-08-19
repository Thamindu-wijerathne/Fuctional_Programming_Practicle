
import scala.io.StdIn.readLine

object Day8ones {
  def caesarEncrypt(plaintext: String, shift: Int): String = {
    plaintext.map { char =>
      if (char.isLetter) {
        val shiftBase = if (char.isLower) 'a' else 'A'
        (((char - shiftBase + shift) + 26) % 26 + shiftBase).toChar
      }
      else {
        char
      }
    }
  }

  def Enycript(text: String, shift: Int, cipherFunction: (String, Int) => String): String = {
    cipherFunction(text, shift)
  }

  def Decrypt(ciphertext: String, shift: Int, cipherFunction: (String, Int) => String): String = {
    caesarEncrypt(ciphertext, -shift)
  }


  def main(args: Array[String]): Unit = {
    println("Enter a string:")
    val plaintext = readLine()
    println("Enter shift value :")
    val temp = readLine()
    val shiftValue = temp.toInt

    // Encryption
    val encryptedText = Enycript(plaintext, shiftValue, caesarEncrypt)
    println("Encrypted: " + encryptedText)

    // Decryption
    val decryptedText = Decrypt(encryptedText, shiftValue, caesarEncrypt)
    println("Decrypted: " + decryptedText)
  }
}