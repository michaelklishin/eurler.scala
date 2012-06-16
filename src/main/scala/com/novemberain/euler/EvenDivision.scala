package com.novemberain.euler

object EvenDivision {
  def isEvenlyDivisable(x: Int, y: Int) = (x % y) == 0
  def isEvenlyDivisableByAll(x: Int, ys: Iterable[Int]) = ys.forall(isEvenlyDivisable(x, _))
}
