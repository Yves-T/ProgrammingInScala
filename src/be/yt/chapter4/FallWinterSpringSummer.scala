package be.yt.chapter4
import ChecksumAccumulator.calculate

/**
 * User: Yves-T
 * Date: 30/12/12
 * Time: 09:42
 * 
 */
object FallWinterSpringSummer extends App{
for (season <- List("fall","winter","spring"))
  println(season+": "+calculate(season))
}
