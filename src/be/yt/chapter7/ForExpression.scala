package be.yt.chapter7

import java.io.File

/**
 * User: Yves-T
 * Date: 31/12/12
 * Time: 14:23
 */
class ForExpression {
  val filesHere = (new File(".")).listFiles()
  def simpleFor() {
    for (file <- filesHere)
      println(file)
  }

  def range() {
    for (i <- 1 to 4)
      println("Iteration i" + i)
  }

  def rangeWithoutUpperBound() {
    for (i <- 1 until 4)
      println("Iteration without upper bound " + i)
  }

  def iteratingWithFilter() {
    for (file <- filesHere if file.getName.endsWith(".txt"))
      println(file)
  }

  def printOnlyFilesAndNotDirs() {
    for (
      file <- filesHere
      // keep adding filters....
      if file.isFile
      if file.getName.endsWith(".txt")
    ) println(file)
  }

  def fileLines(file:java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList

  def grep(pattern: String) {
    for {
      file <- filesHere
      if file.getName.endsWith(".scala");
      line <- fileLines(file)
      trimmed = line.trim
      if line.trim.matches(pattern)

    } println(file + ": " + trimmed)
  }

  def textFiles =
    for {
      file <- filesHere
      if file.getName.endsWith(".txt")

    } yield file

  val forLineLengths =
    for {
      file <- filesHere
      if file.getName.endsWith(".txt")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*val.*")
    } yield trimmed.length
}
