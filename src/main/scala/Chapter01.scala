import math.{BigInt, random}
import scala.BigInt._
import scala.util._

object Chapter01 {
  //  1. In the Scala REPL, type 3. followed by the Tab key. What methods can be applied?
  //
  //  Lots of methods. Tab completion does not work in the IntelliJ built in REPL but CTRL+SPACE seems to load
  //  intellisense

  //  2. In the Scala REPL, compute the square root of 3, and then square that value. By how much does he result differ
  //  from 3? (Hint: The res variables are your friend.)
  //
  //  scala> math.sqrt(3)
  //  val res34: Double = 1.7320508075688772
  //
  //  scala> res32 * res32
  //  val res35: Double = 2.9999999999999996
  //
  //  scala> 3 - res35
  //  val res37: Double = 4.440892098500626E-16

  //  3. Are the res variables val or var?
  //  Res variables are val (constants)

  //  4. Scala lets you multiply a string with a number—try out "crazy" * 3 in the REPL. What does this operation do?
  //  Where can you find it in Scaladoc?
  //
  //  Repeats the string 3 times:
  //
  //  scala> "crazy" * 3
  //  val res38: String = crazycrazycrazy
  //
  //  In the StringOps collection
  //  https://www.scala-lang.org/api/2.13.3/scala/collection/StringOps.html

  //  5. What does 10 max 2 mean? In which class is the max method defined?
  //  Returns the max value given two arguments.
  //  Defined in RichInt
  //  https://www.scala-lang.org/api/2.13.3/scala/Int.html#max(that:Int):Int

  //  6. Using BigInt, compute 2^1024
  def computeBigInt() : BigInt = BigInt(2).pow(1024)

  //  7. What do you need to import so that you can get a random prime as probablePrime(100,
  //  Random), without any qualifiers before probablePrime and Random?
  //
  //  Need to import `scala.BigInt._` and `scala.util._`

  def randomPrime() : BigInt = probablePrime(100, Random)

  //  8. One way to create random file or directory names is to produce a random BigInt and convert it to base 36,
  //  yielding a string such as "qsnvbevtomcj38o06kul". Poke around Scaladoc to find a way of doing this in Scala.
  //
  //  toString takes a radix
  def generateFileName() : String = randomPrime().toString(32)

  //  9. How do you get the first character of a string in Scala? The last character?
  //
  //  For first character we can do `"string.head"`.
  //  And for the last character we can do `"string.last"`

  //  10. What do the take, drop, takeRight, and dropRight string functions do? What
  //  advantage or disadvantage do they have over using substring?
  //
  //  take: Selects first n elements.
  //  drop: Selects all elements except first n ones.
  //  takeRight: Selects last n elements.
  //  dropRight: Selects all elements except last n ones.
  //
  //  Advantages over substring is more intuitive and does not throw out of bounds exceptions

}
