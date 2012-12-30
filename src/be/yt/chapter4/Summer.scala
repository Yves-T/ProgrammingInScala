package be.yt.chapter4

import ChecksumAccumulator.calculate

/**
 * User: Yves-T
 * Date: 30/12/12
 * Time: 07:56
 *
 */
object Summer {
  def main(args: Array[String]) {
    for (arg <- args)
      println(arg + ": " + calculate(arg))
  }
}
