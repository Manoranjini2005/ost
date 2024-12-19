object DivisionHandling {
  def safeDivision(numerator: Int, denominator: Int): Unit = {
    try {
      val result = numerator / denominator
      println(s"Result of division: $result")
    } catch {
      case e: ArithmeticException =>
        println("Error: Division by zero is not allowed.")
      case _: NumberFormatException =>
        println("Error: Please enter valid integers.")
    } finally {
      println("Division operation completed.")
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter numerator:")
    val numerator = scala.io.StdIn.readInt()
    println("Enter denominator:")
    val denominator = scala.io.StdIn.readInt()

    safeDivision(numerator, denominator)
  }
}
