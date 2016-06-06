package test.scala

import main.scala.FizzBuzz
import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {
  it should "return fizz if number is dividable by 3" in {
    FizzBuzz.getResult(3) should be ("fizz")
    FizzBuzz.getResult(6) should be ("fizz")
    FizzBuzz.getResult(9) should be ("fizz")
  }

  it should "return buzz if number is dividable by 5" in {
    FizzBuzz.getResult(5) should be ("buzz")
    FizzBuzz.getResult(10) should be ("buzz")
  }

  it should "return fizzbuzz if number is dividable by 3 and 5" in {
    FizzBuzz.getResult(15) should be ("fizzbuzz")
    FizzBuzz.getResult(30) should be ("fizzbuzz")
  }

  it should "return the same number for other cases" in {
    FizzBuzz.getResult(1) should be (1)
    FizzBuzz.getResult(2) should be (2)
    FizzBuzz.getResult(4) should be (4)
  }
}
