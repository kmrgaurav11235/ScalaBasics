package in.gaurav
package lectures.part1basics

object Basics03Functions extends App {

  def aFunction(a: String, b: Int): String =
    a + " " + b

  def aFunctionWithBlock(a: String, b: Int): String = {
    b + " " + a
  }

  println(aFunction("Hello", 1))
  println(aFunctionWithBlock("Hello", 2))

  // Parameter-less function can also be called without parentheses
  def aParameterlessFunc(): Int = 20
  println(aParameterlessFunc())
  println(aParameterlessFunc)

  // Just as compiler can figure out the type of var/val,
  // it can also figure out the return type of a function
  def noReturnType(n: Int) = n + 1

  def aRepeatedFunc(aString: String, num: Int): String =
    if (num == 1) aString
    else aString + aRepeatedFunc(aString, num - 1)

  println(aRepeatedFunc("Hello", 3))

  // Compiler cannot figure out the return type of a recursive function on its own
  // In Scala, when you need loops -> use Recursion instead

  // Unit can also be the return type
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  aFunctionWithSideEffects("56")

  // Auxiliary functions: functions inside functions
  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b
    aSmallFunction(n, n - 1)
  }
  println(aBigFunction(10))
}
