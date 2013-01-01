package be.yt.chapter7

/**
 * User: Yves-T
 * Date: 01/01/13
 * Time: 12:00
 *
 */
object MatchExpressionTester extends App {
  val firstArg = "eggs"

  val friend = firstArg match {
    case "salt" => ("pepper")
    case "chips" => ("salsa")
    case "eggs" => ("bacon")
    case _ => ("huh?")
  }

  println(friend)
}
