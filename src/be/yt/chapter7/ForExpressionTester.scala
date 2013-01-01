package be.yt.chapter7

/**
 * User: Yves-T
 * Date: 31/12/12
 * Time: 14:27
 */
object ForExpressionTester extends App {
  val forExpression = new ForExpression()

  println("\nsimple for")
  forExpression.simpleFor()

  println("\nfor range")
  forExpression.range()

  println("\nfor range without upper bound")
  forExpression.rangeWithoutUpperBound()

  println("\nfor range with filter")
  forExpression.iteratingWithFilter()

  println("\nfor range with more then one filter")
  forExpression.printOnlyFilesAndNotDirs()

  println("\nfor range with multiple generators")
  forExpression.grep(".*gcd.*")

  println("\nfor with yield")
  val scalaFiles = forExpression.textFiles
  for (file <- scalaFiles)
    println(file)

  println("\nfor with yield")
  val lineLengths = forExpression.forLineLengths
  for (file <- lineLengths)
    println(file)
}
