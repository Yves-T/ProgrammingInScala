package be.yt.chapter4

/**
 * User: Yves-T
 * Date: 30/12/12
 * Time: 07:59
 *
 */
class ChecksumAccumulator {
  // class definition goes here
  private var sum = 0

  def add(b: Byte): Unit = sum += b

  def checkSum(): Int = return ~(sum & 0xFF) + 1
}

object ChecksumAccumulator {
  private var cache = Map[String, Int]()

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checkSum()
      cache += (s -> cs)
      cs
    }
}