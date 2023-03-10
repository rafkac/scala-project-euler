package P09

object Pythagorean extends App {

  val result = (for (b <- 2 until 1000; a <- 1 until b; c = 1000 - a - b
                     if a * a + b * b == c * c) yield a * b * c).head

  // prints 31875000
  println(result)
}
