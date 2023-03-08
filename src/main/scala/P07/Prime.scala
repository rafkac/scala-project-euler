package P07

object Prime extends App {

  def isPrime(n: Int): Boolean = !((2 until n - 1) exists (n % _ == 0))

  lazy val primes: LazyList[Int] = 2 +: LazyList.from(3).filter(isPrime)

  // prints 104743
  println(primes(10000))
}