import scala.collection.mutable.ListBuffer

object Day10three {
  class Account(var balance: BigDecimal) {

    // Method to deposit money into the account
    def deposit(amount: BigDecimal): Unit = {
      balance += amount
    }

    // Method to withdraw money from the account
    def withdraw(amount: BigDecimal): Unit = {
      if (balance >= amount) {
        balance -= amount
      } else {
        println("Insufficient funds!")
      }
    }

    // Method to transfer money from this account to another account
    def transfer(amount: BigDecimal, targetAccount: Account): Unit = {
      if (balance >= amount) {
        withdraw(amount)           // Withdraw from this account
        targetAccount.deposit(amount)  // Deposit to the target account
      } else {
        println("Insufficient funds for transfer!")
      }
    }

    override def toString: String = f"Account(balance: $$${balance}%.2f)"
  }

  // Correct the main method to run the code directly
  def main(args: Array[String]): Unit = {
    val account1 = new Account(500)  // Account with initial balance 500
    val account2 = new Account(200)  // Account with initial balance 200

    println("Initial Balances:")
    println(account1)  // Output: Account(balance: $500.00)
    println(account2)  // Output: Account(balance: $200.00)

    // Transfer 100 from account1 to account2
    account1.transfer(100, account2)

    println("\nBalances after transfer:")
    println(account1)  // Output: Account(balance: $400.00)
    println(account2)  // Output: Account(balance: $300.00)
  }
}
