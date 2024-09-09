object Day10four {

  // Simple Account class
  class Account(var balance: BigDecimal) {

    // Method to deposit money
    def deposit(amount: BigDecimal): Unit = {
      balance += amount
    }

    // Method to withdraw money
    def withdraw(amount: BigDecimal): Unit = {
      balance -= amount
    }

    override def toString: String = f"Account(balance: $$${balance}%.2f)"
  }

  // Bank class that operates on a list of accounts
  class Bank(val accounts: List[Account]) {

    // 4.1 List of Accounts with negative balances
    def accountsWithNegativeBalances(): List[Account] = {
      accounts.filter(_.balance < 0)
    }

    // 4.2 Calculate the sum of all account balances
    def totalBalance(): BigDecimal = {
      accounts.map(_.balance).sum
    }

    // 4.3 Apply interest to all accounts
    def applyInterest(): Unit = {
      accounts.foreach { account =>
        if (account.balance > 0) {
          account.deposit(account.balance * 0.05)  // 5% interest for positive balance
        } else {
          account.withdraw(account.balance.abs * 0.1)  // 10% overdraft penalty for negative balance
        }
      }
    }
  }

  def main(args: Array[String]): Unit = {
    // Creating sample accounts
    val account1 = new Account(1000)  // Positive balance
    val account2 = new Account(-200)  // Negative balance
    val account3 = new Account(300)   // Positive balance
    val account4 = new Account(-50)   // Negative balance

    // Creating a bank with these accounts
    val bank = new Bank(List(account1, account2, account3, account4))

    // 4.1 List of Accounts with negative balances
    println("Accounts with negative balances:")
    bank.accountsWithNegativeBalances().foreach(println)

    // 4.2 Calculate the sum of all account balances
    println(s"\nTotal balance of all accounts: $$${bank.totalBalance()}")

    // 4.3 Apply interest and show final balances
    bank.applyInterest()
    println("\nBalances after applying interest:")
    bank.accounts.foreach(println)
  }
}
