import java.math.BigInteger

/**
 * User: Yves-T
 * Date: 29/12/12
 * Time: 16:34
 *
 */
val big = new BigInteger("12345")
val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

for (i <- 0 to 2)
  print(greetStrings(i))


val numNames = Array("zero", "one", "two")
for (i <- 0 to 2)
  println(numNames(i))






val oneTwoThree = List(1, 2, 3)
val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreefour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreefour + " is a new list.")
val twoTHree = List(2, 3)
val oneTwoThree2 = 1 :: twoTHree
println(oneTwoThree)
val pair = (99, "Luftballons")
println(pair._1)
println(pair._2)
var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"

// use an immutable set

import scala.collection.mutable.Set

val movieSet = Set("Hitch", "Poltergeist")




movieSet += "Shrek"
println(movieSet)

import scala.collection.immutable.HashSet

val hashSet = HashSet("Tomatoes", "Chilies")



println(hashSet + "Coriander")

// map

import scala.collection.mutable.Map

val treasureMap = Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "FInd big X on ground.")
treasureMap += (3 -> "Dig.")


println(treasureMap(2))
val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
println(romanNumeral(4))
val myString = "This is my string"
val s = "Hello world"
s indexOf('w')

