package CoderByte

import scala.io.StdIn.readLine

object Factorial {

  def main(args: Array[String]): Unit = {
    println(FirstFactorial(readLine().toInt))
  }

  private def FirstFactorial(num: Int): Int = {
    if (num <= 1) return num
    num * FirstFactorial(num - 1)
  }
}