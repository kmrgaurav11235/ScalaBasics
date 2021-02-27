package in.gaurav
package lectures.part1basics

object Basics05CallByNameAndValue extends App {

  def calledByValue(x: Long): Unit = {
    println("Called by value: " + x)
    println("Called by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("Called by name: " + x)
    println("Called by name: " + x)
  }

  /*
  This will print the same value twice as it calls by value. It evaluates the expression
  and then sends the value to the function.
  */
  calledByValue(System.nanoTime())

  /*
  This will print different values as it calls by name. This doesn't evaluates the expression
  until it is needed. Also, it evaluates the expression anew every time it is used.
   */
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) : Unit = println("test")

  // This fails as infinite() is called by value and needs to be evaluated
  // printFirst(infinite(), 10)

  // This doesn't fails as infinite() is called by name and doesn't needs to be evaluated
  printFirst(10, infinite())
}
