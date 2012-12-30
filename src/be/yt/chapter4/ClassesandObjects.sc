/**
 * User: Yves-T
 * Date: 29/12/12
 * Time: 15:39
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

new ChecksumAccumulator
val acc = new ChecksumAccumulator
val csa = new ChecksumAccumulator
ChecksumAccumulator.calculate("Every value is an object")


