package be.yt.mix

/**
 * User: Yves-T
 * Date: 29/12/12
 * Time: 18:08
 * 
 */
class GreetingInScala {

  def greet() {
    val delegate = new GreetingInJava

    delegate.greet()
  }
}
