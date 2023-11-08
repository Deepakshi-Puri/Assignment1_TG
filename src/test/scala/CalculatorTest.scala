import org.scalatest.funsuite.AnyFunSuite

class CalculatorTest extends AnyFunSuite {
val calculator = new Calculator
  test("Addition"){
    assert(calculator.addition(4,7) == 11)
    assert(calculator.addition(4,-7) == -3)
    assert(calculator.addition(3,0) == 3)
  }

  test("Subtraction") {
    assert(calculator.subtraction(4, 7) == -3)
    assert(calculator.subtraction(-3,-2) == -1)
  }

  test("Multiplication") {
    assert(calculator.multiplication(4, 7) == 28)
  }

  test("Division by non-zero number should return Right result") {
    assert(calculator.division(10, 2) == Right(5))
  }

  test("Division by zero should return Left error message") {
    assert(calculator.division(10, 0) == Left("Division by zero is not allowed."))
  }

}