package P07

object Prime extends App {

  def isPrime(n: Int) = Range(2, n - 1).count(n % _ == 0) == 0
}