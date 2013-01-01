package be.yt.chapter8

import io.Source

/**
 * User: Yves-T
 * Date: 01/01/13
 * Time: 14:16
 *
 */
object LongLines {

  // helper function inside function
  def processFile(filename: String, width: Int) {
    // inner function
    def processLine(line: String) {
      if (line.length > width)
        println(filename + ": " + line)
    }
    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(line)
  }

  def main(args: Array[String]) {
    val width = 45
    processFile("ReadLinesFromAFile.txt", width)
  }
}
