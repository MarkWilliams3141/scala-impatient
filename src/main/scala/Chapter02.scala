import java.time.LocalDate

object Chapter02 {

  //  1. The signum of a number is 1 if the number is positive, –1 if it is negative, and 0 if it is zero.
  //  Write a function that computes this value
  def signum(n: Int): Int = {
    if (n > 0) 1
    else if (n < 0) -1
    else 0
  }

  //  2. What is the value of an empty block expression {}? What is its type?

  // Value is () and type is Unit
  val emptyBlockExpression: Unit = {}

  //  3. Come up with one situation where the assignment x = y = 1 is valid in Scala.
  //  (Hint: Pick a suitable type for x.)
  //
  //  x must be of type unit. when chaining assignments in scala the value of y is not assigned to x
  def exercise3(): Unit = {
    var y: Int = 0
    var x: Unit = ()
    x = y = 1
  }

  //  4. Write a Scala equivalent for the Java loop
  //  for (int i = 10; i >= 0; i--) System.out.println(i);
  //
  def exercise4(): Unit = {

    for(i <- 10 to (0, -1))
      println(i)
  }

  //  5. Write a procedure countdown(n: Int) that prints the numbers from n to 0.
  def countdown(n: Int): Unit = {
    for(i <- n to (0, -1))
      println(i)
  }

  //  6. Write a for loop for computing the product of the Unicode codes of all letters in a string. For
  //  example, the product of the characters in "Hello" is 9415087488L.
  def productOfString(s: String): Long = {
    var product: Long = 1
    for(c <- s) product = c.toLong * product
    product
  }

  //  7. Solve the preceding exercise without writing a loop. (Hint: Look at the StringOps
  //  Scaladoc.)
  def productOfString2(s: String): Long = s.map(_.toLong).product

  //  8. Write a function product(s : String) that computes the product, as described in the
  //  preceding exercises.
  def product(s : String): Long = s.map(_.toLong).product

  // 9. Make the function of the preceding exercise a recursive function.
  def recursiveProduct(s: String): Long = {
    if (s.length == 1) s.head
    else recursiveProduct(s.tail) * s.head
  }

  //  10. Write a function that computes x^n, where n is an integer. Use the following recursive
  //    definition:
  //  • x^n = y · y if n is even and positive, where y = x^(n / 2). +++
  //  • x^n = x · x^n – 1 if n is odd and positive.
  //  • x^0 = 1.
  //  • x^n = 1 / x–n if n is negative.
  //    Don’t use a return statement.

  def power(x: Int, n: Int): Int = {
    if( n == 0 ) { 1 }
    else if (n < 0) 1 / power(x, -n)
    else if (n % 2 != 0) x * power(x, n - 1)
    else {
      val y = power(x, (n / 2))
      y * y
    }
  }

  //  11. Define a string interpolator date so that you can define a java.time.LocalDate as
  //    date"$year-$month-$day". You need to define an “implicit” class with a date
  //    method, like this:
  //  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
  //    def date(args: Any*): LocalDate = . . .
  //  }
  //  args(i) is the value of the ith expression. Convert each to a string and then to an integer, and
  //  pass them to the LocalDate.of method. If you already know some Scala, add error
  //    handling. Throw an exception if there aren’t three arguments, or if they aren’t integers, or if they
  //  aren’t separated by dashes. (You get the strings in between the expressions as sc.parts.)

  //  Leaving this one for later...
}
