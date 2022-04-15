package P02

import scala.annotation.tailrec

object EvenFibonacci extends App {

  def even(n: Int): Boolean = n % 2 == 0

  @tailrec
  def records(fibo: Seq[Int], sum: Int): Int = fibo.last match {
    case n if n >= 4000000 => sum - n
    case n if even(n) => records(fibo :+ fibo.takeRight(2).sum, sum + fibo.takeRight(2).sum)
    case _ => records(fibo :+ fibo.takeRight(2).sum, sum)
  }

  val solution = records(List(1, 2), 2)

  println(solution)
  //  5702887
}
