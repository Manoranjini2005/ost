object BankAccountApp {
  private var balance: Double = 1000.0 // Initial balance

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(f"Deposited: $$${amount}%.2f, New Balance: $$${balance}%.2f")
    } else {
      println("Invalid deposit amount!")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println(f"Withdrew: $$${amount}%.2f, New Balance: $$${balance}%.2f")
    } else {
      println("Invalid or insufficient funds!")
    }
  }

  def checkBalance(): Unit = {
    println(f"Current Balance: $$${balance}%.2f")
  }

  def main(args: Array[String]): Unit = {
    var continue = true
    while (continue) {
      println("Choose an option: 1. Deposit 2. Withdraw 3. Check Balance 4. Exit")
      scala.io.StdIn.readInt() match {
        case 1 =>
          println("Enter amount to deposit:")
          deposit(scala.io.StdIn.readDouble())
        case 2 =>
          println("Enter amount to withdraw:")
          withdraw(scala.io.StdIn.readDouble())
        case 3 =>
          checkBalance()
        case 4 =>
          println("Thank you for using the bank system. Goodbye!")
          continue = false
        case _ =>
          println("Invalid option. Please try again.")
      }
    }
  }
}
