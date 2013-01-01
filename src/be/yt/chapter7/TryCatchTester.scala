package be.yt.chapter7

/**
 * User: Yves-T
 * Date: 01/01/13
 * Time: 11:44
 *
 */
object TryCatchTester extends App {
  val tryCatchTester = new TryCatch()

  // try catch result in a value
  val malformedUrl = tryCatchTester.urlFor("malformedURL")
  println("host of url : " + malformedUrl.getHost)
  println("protocol of url : " + malformedUrl.getProtocol)

  val goodUrl = tryCatchTester.urlFor("http://www.apple.com")
  println("host of url : " + goodUrl.getHost)
  println("protocol of url : " + goodUrl.getProtocol)
}
