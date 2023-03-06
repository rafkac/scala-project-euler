package P06

object P06 extends App {

  def sumOfSquares(n: Int): BigInt = (1 to n).foldLeft(0: BigInt) {
    (res, x) => res + x * x
  }

  def squaredSum(n: Int): BigInt = math.pow((1 to n).sum, 2).toInt

  def difference(n: Int) = squaredSum(n) - sumOfSquares(n)

  // prints 25164150
  println(difference(100))
}
