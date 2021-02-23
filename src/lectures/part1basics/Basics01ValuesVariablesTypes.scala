package in.gaurav
package lectures.part1basics

object Basics01ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE
  // x = 2

  // Compiler can infer types
  val y = 11

  // Even if you are providing the type, the compiler will still double-check if it matches the RHS
  // val z: Int = "37"

  // Semi-colons are allowed but not necessary
  val sString: String = "Hello";

  val aBoolean: Boolean = true
  val aChar: Char = 'a'

  val aShort: Short = 4613
  // Compiler will complain if value is too big to be contained in Short.
  // val anotherShort: Short = 461312

  val aLong: Long = 26899708786L
  val aFloat: Float = 2.03F
  val aDouble: Double = 56.9

  // VARIABLES
  var aVariable: Int = 4
  // Variable can be re-assigned
  aVariable = 6
  // Changing a variable is a "Side-Effect"
}
