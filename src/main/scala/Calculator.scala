object Calculator {
  def main(args: Array[String]): Unit = {

  }
}
class Calculator {

  def addition(a: Int, b: Int): Int = {
    a + b
  }
  def subtraction(a: Int, b: Int): Int = {
    a - b
  }
  def multiplication(a: Int, b: Int): Int = {
    a * b
  }
  def division(a: Int, b: Int): Either[String, Int] = {
    if (b != 0)
      Right(a / b)
    else
      Left("Division by zero is not allowed.")
  }

}