package in.gaurav
package exercises.part1basics

object Basics03Functions extends App {
  /*
  1. Greeting function for kids
  Takes 2 parameters: name, age
  Returns -> Hi, my name is $name and I am $age years old
   */
  def greet(name: String, age: Int) : String =
    "Hi, my name is " + name + " and I am " + age + " years old"

  println(greet("Bobby", 13))

  /*
  2. Factorial function : 1 * 2 * ... * n
   */
  def factorial(num: Int): Int =
    if (num <= 1) 1
    else num * factorial(num - 1)

  println(factorial(5))

  /*
  3. Fibonacci function:
  f(n) = f(n - 1) + f(n - 2)
  Return the nth Fibonacci number
   */
  def fibonacci(num: Int): Int =
    if (num <= 2) 1
    else fibonacci(num - 1) + fibonacci(num - 2)

  println(fibonacci(8))

  /*
  4. Tests if a number is prime
   */
  def isPrime(num: Int): Boolean = {
    def isPrimeUntil(k: Int): Boolean = {
      if (k > (num / 2)) true
      else (num % k != 0) && isPrimeUntil(k + 1)
    }
    isPrimeUntil(2)
  }

  println("Is 17 Prime: " + isPrime(17))
  println("Is 49 Prime: " + isPrime(49))
}
