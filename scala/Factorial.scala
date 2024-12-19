object Factorial {
  def factorial(n: Int): Int = {
    if (n == 0 || n == 1) 1
    else n * factorial(n - 1)
  }

  def main(args: Array[String]): Unit = {
    println("Enter a number:")
    val number = scala.io.StdIn.readInt()
    println(s"Factorial of $number is: ${factorial(number)}")
  }
}
