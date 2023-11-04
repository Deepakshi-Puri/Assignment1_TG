import org.scalatest.funsuite.AnyFunSuite

class CalculatorTest extends AnyFunSuite {
  test("Addition"){
    assert(Calculator.addition(4,7) == 11)
    assert(Calculator.addition(4,-7) == -3)
    assert(Calculator.addition(3,0) == 3)
  }
  test("Subtraction") {
    assert(Calculator.subtraction(4, 7) == -3)
    assert(Calculator.subtraction(-3,-2) == -1)
  }
  test("Multiplication") {
    assert(Calculator.multiplication(4, 7) == 28)
  }
  test("Division") {
    assert(Calculator.division(4, 7) == 0)
  }
  test("Division by zero is not allowed"){
    assertThrows[IllegalArgumentException](Calculator.division(4,0))
  }
}