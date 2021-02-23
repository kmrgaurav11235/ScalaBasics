package in.gaurav
package lectures.part1basics

object Basics02Expressions extends App {

  val x = 1 + 2 // RHS is an 'Expression'.
  // Compiler can figure out the type of x by figuring out the type of the RHS expression
  println(x)

  // Math Expression
  println(2 + 10 / 2 * 11)
  // Math operators: + - * / % | & ^ << >> >>> (right-shift with 0 extension)

  // Relational Expression
  println(1 == x)
  // Relational operators: == != > < >= <=

  // Logical operators:
  // Unary: !
  // Binary: && ||
  println(!(1 == x))

  // Side Effects: += -+ *= /=
  var aVar = 10
  aVar += 3
  println(aVar)

  // Instructions vs Expressions
  // Instruction: Do Something - Java, C etc.
  // Expression: Compute a value - Scala

  // IF Expression: It is assigned a value
  val aCondition = true
  val aDependentValue = if (aCondition) 5 else 3
  println(aDependentValue)

  // Loops don't return anything meaningful. So, they are a side-effect
  // Their use is discouraged in Scala
  var i = 1
  while (i < 5) {
    println(i)
    i += 1
  }
  // Avoid Loops like the Plague. Loops are specific to Imperative Programming

  // Everything in Scala is an expression
  val aWeirdVal: Unit = (aVar = 3) // Unit = void
  println(aWeirdVal)
  // Side effects are expressions that return unit
  // e.g. println(), while, re-assignment etc.

  // Code Blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z == 3) "Hello" else "Bye" // Value of code block is the value of last statement
  }

  println(aCodeBlock)
}
