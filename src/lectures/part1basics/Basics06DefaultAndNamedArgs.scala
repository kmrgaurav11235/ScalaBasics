package in.gaurav
package lectures.part1basics

object Basics06DefaultAndNamedArgs extends App {
  // Here, accumulator is always called with the same value: 1.
  // We can supply a default value for the accumulator
  def tailRecFactorial(num: Int, accumulator: Int = 1): Int =
    if (num <= 1) accumulator
    else tailRecFactorial(num - 1, accumulator * num)

  val fact0 = tailRecFactorial(10) // without value provided
  val fact1 = tailRecFactorial(10, 2) // with value provided

  println("Factorial 10 = " + fact0 + "\n2 * Factorial 10 = " + fact1)

  def savePicture(format: String = "jpeg", height: Int, width: Int): Unit =
    println("Saving Picture: {format: " + format + ", height: "
      + height + ", width: " + width + "}")

  /*
  Compiler will complain about this even though format has a default value. It thinks
  that '800' is the 'format' parameter. Leading default values cannot be omitted.
   */
  // savePicture(800, 600)

  // One of the solution to above is named arguments
  savePicture(height = 800, width = 600)

  // If you name the arguments, you can also pass them in a differnt order
  savePicture(width = 1080, format = "png", height = 1920)
}
