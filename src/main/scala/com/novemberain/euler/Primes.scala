package com.novemberain.euler

object Primes {
  def upToNth(n: Int): IndexedSeq[Int] = {
    def advance(p: Int, xs: IndexedSeq[Int]) = {
      xs.filter((z: Int) => (!EvenDivision.isEvenlyDivisable(z, p) || (z == p)))
    }

    def iterate(p: Int, xs: IndexedSeq[Int], i: Int): IndexedSeq[Int] = {
      ((p * p) > n) match {
        case true => xs
        case false => {
          val y = i + 1
          val l = xs(y)
          iterate(l, advance(l, xs), y)
        }
      }
    }

    iterate(2, Range(2, (n + 1)), -1)
  }
}
