object AverageMarks {
  def calculateAverage(marks: Array[Int]): Double = {
    val total = marks.sum
    total.toDouble / marks.length
  }

  def main(args: Array[String]): Unit = {
    val marks = new Arrayne an array of integers with size 10
    println("Enter the marks of 10 students:")

    for (i <- marks.indices) {
      print(s"Student ${i + 1}: ")
      marks(i) = scala.io.StdIn.readInt()
    }

    println(s"Average marks: ${calculateAverage(marks)}")
  }
}
