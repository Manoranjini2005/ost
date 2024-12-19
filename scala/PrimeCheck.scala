object PrimeCheck {
  def isPrime(number: Int): Boolean = {
    if (number <= 1) false
    else (2 until number).forall(n => number % n != 0)
  }

  def main(args: Array[String]): Unit = {
    println("Enter a number:")
    val number = scala.io.StdIn.readInt()

    if (isPrime(number)) {
      println(s"$number is a prime number.")
    } else {
      println(s"$number is not a prime number.")
    }
  }
}
