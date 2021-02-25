package in.gaurav
package lectures.part1basics

import scala.annotation.tailrec

object Basics04Recursion extends App {
  // Recursive Function for factorial
  def factorial(num: Int): Int =
    if (num <= 1) 1
    else {
      println("Computing factorial of " + num + ". First I need factorial of " + (num - 1) + ".")
      val result = num * factorial(num - 1)
      println("Computed factorial of " + num + " = " + result + ".")
      result
    }

  println("Factorial of 5 = " + factorial(5))
  /*
  To run a recursive function, the JVM (on top of which Scala runs) uses a Call Stack.
  This is where the partial results are stored.

  If the recursive depth is too big, we will get a Stack Overflow.
   */

  // This will lead to StackOverflowError:
  // println("Factorial of 5 = " + factorial(5000))

  // The solution is Tail Recursion
  def tailRecFactorial(num: Int): BigInt = {
    @tailrec
    def factorialHelper(n: Int, accumulator: BigInt): BigInt =
      if (n <= 1) accumulator
      else factorialHelper(n - 1, n * accumulator)

    factorialHelper(num, 1)
  }
  println("\nTail Recursion: Factorial of 5000 = " + tailRecFactorial(5000))

  /*
  The reason that Tail Recursion doesn't gives a StackOverflowError is: The recursive call
  is the last expression in the code path. The allows Scala tp use the same Stack frame for
  the recursive calls. In the previous implementation, Scala needed a CallStack frame for
  each recursive call. This is so that it can compute the the recursive value and use it to
  calculate the result. However, in case of Tail Recursion, the current Stackframe can be
  completely replaced by the new one.

  TAIL RECURSION: Use the recursive call as the last expression.
  The annotation '@tailrec' tells the compiler to throw an error if the function is not Tail
  Recursive.

  WHEN YOU NEED LOOPS, USE TAIL RECURSION.
   */
}
