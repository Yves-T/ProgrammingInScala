package be.yt.chapter6

/**
 * User: Yves-T
 * Date: 30/12/12
 * Time: 15:14
 *
 */
class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1) // auxiliary constructor

  override def toString: String = numer + "/" + denom

  // add operator
  def +(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def +(i: Int): Rational =
    new Rational(numer + i * denom, denom)

  // subtract operator
  def -(that: Rational): Rational = new Rational(
    numer * that.denom - that.numer * denom,
    denom * that.denom
  )

  def -(i: Int): Rational =
    new Rational(numer - i * denom, denom)

  // multiply operator
  def *(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  def *(i: Int): Rational = new Rational(numer * i, denom)

  // devision operator
  def /(that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)

  def /(i: Int): Rational =
    new Rational(numer, denom * i)

  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) =
    if (this.lessThan(that)) that else this

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}
