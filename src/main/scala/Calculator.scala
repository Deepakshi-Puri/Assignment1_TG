object Calculator extends App {

  print("Enter 1st number: ")
  val n1 = scala.io.StdIn.readInt()
  print("Enter 2nd number: ")
  val n2 = scala.io.StdIn.readInt()

  def addition(a: Int, b: Int): Int = {
    a + b
  }
  def subtraction(a: Int, b: Int): Int = {
    a - b
  }
  def multiplication(a: Int, b: Int): Int = {
    a * b
  }
  def division(a: Int, b: Int): Int = {
    if (b != 0) a / b
    else throw new IllegalArgumentException("Division by zero is not allowed.")
  }

  println(s"Addition Result: " + addition(n1, n2))
  println(s"Subtraction Result: " + subtraction(n1, n2))
  println(s"Multiplication Result: " + multiplication(n1, n2))
  println(s"Division Result: " + division(n1, n2))
}