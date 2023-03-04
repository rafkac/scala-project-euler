package P03

object LargestPrime extends App {

  val n = 600851475143L

  def largestPrimeFactor(b: Long) = {
    def loop(factor: Long, n: Long): Long =
      if (factor == n) n
      else if (n % factor == 0) loop(factor, n / factor)
      else loop(factor + 1, n)

    loop(2L, b)
  }

  // prints 6857
  println(largestPrimeFactor(n))
}