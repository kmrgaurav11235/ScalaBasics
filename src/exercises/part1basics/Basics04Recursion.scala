package in.gaurav
package exercises.part1basics

import scala.annotation.tailrec

object Basics04Recursion extends App {
  // 1. Concatenate a String n times using Tail Recursion
  def concat(str: String, n: Int): String = {
    @tailrec
    def concatUtil(n: Int, accumulator: String): String =
      if (n <= 0) accumulator
      else concatUtil(n - 1, str + accumulator)

    concatUtil(n, "")
  }

  println(concat("Hello", 3))

  // 2. Tail Recursive isPrime(num)
  def isPrime(num: Int): Boolean = {
    @tailrec
    def isPrimeUtil(k: Int, accumulator: Boolean): Boolean =
      if (k > num / 2) true
      else if (!accumulator) false
      else isPrimeUtil(k + 1, num % k != 0)

    isPrimeUtil(2, true)
  }

  println("Is 17 Prime: " + isPrime(17))
  println("Is 49 Prime: " + isPrime(49))
  println("Is 13 * 11 Prime: " + isPrime(13 * 11))

  // 3. Tail recursive Fibonacci function
  def fibonacci(num: Int): Int = {
    @tailrec
    def fibonacciUtil(i: Int, prev: Int, curr: Int): Int =
      if (i >= num) curr
      else fibonacciUtil(i + 1, curr, prev + curr)

    if (num <= 2) 1
    else fibonacciUtil(2, 1, 1)
  }

  println(fibonacci(8))
}
