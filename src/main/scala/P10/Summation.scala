package P10

object Summation extends App {

  def isPrime(n: Int): Boolean = !((2 until n - 1) exists (n % _ == 0))

  lazy val primes: LazyList[Int] = 2 +: LazyList.from(3).filter(isPrime)

  val result = primes.view.takeWhile(_ < 2000000).foldLeft(0L)(_ + _)

  println(result)
}
