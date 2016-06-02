
object FizzBuzz {
  def getResult(num: Int) = {
    (num % 3, num % 5) match {
      case (0, 0) => "fizzbuzz"
      case (0, _) => "fizz"
      case (_, 0) => "buzz"
      case _ => num
    }
  }
}
