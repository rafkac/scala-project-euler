package P04

object Palindrome extends App {

  def isPalindrome(n: Int): Boolean = {
    val s = n.toString
    s == s.reverse
  }

  def maxPalindrome(min: Int, max: Int): Int =  {
    val pairs = for {
      i <- min to max
      j <- min to max
      if isPalindrome(i * j)
    }
    yield i * j

    pairs.max
  }


  // prints 906609
  println(maxPalindrome(100, 999))
}