package P05

import scala.annotation.tailrec

object SmallestMultiple extends App {

  // greatest common divisor
  @tailrec
  def gcd(a: BigInt, b: BigInt): BigInt = if (b == 0) a else gcd(b, a % b)

  // least common multiple
  def lcm(a: BigInt, b: BigInt): BigInt = (a * b) / gcd(a, b)

  def rangeLcm(n: Int): BigInt = {
    (1 to n).foldLeft(1: BigInt) {
      (res, x) => lcm(res, x)
    }
  }

  // prints 232792560
  println(rangeLcm(20))
}
