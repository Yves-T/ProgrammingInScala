package be.yt.chapter7

import java.net.{MalformedURLException, URL}

/**
 * User: Yves-T
 * Date: 01/01/13
 * Time: 11:38
 *
 */
class TryCatch {
  def urlFor(path: String) =
    try {
      new URL(path)
    } catch {
      case e: MalformedURLException => new URL("http://www.scala-lang.org")
    }
}
