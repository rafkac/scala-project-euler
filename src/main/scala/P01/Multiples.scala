package P01

object Multiples {

  val solution: Int = (1 to 999).foldLeft(0){ (sum, n) =>
    if (n % 3 == 0 || n % 5 == 0) sum + n
    else sum
  }

  println(solution)
  // 233168
}