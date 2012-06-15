package com.novemberain.euler

import org.specs2.mutable.Specification

class FibonacciIteratorSpec extends Specification {
  "Fibonacci iterator seeded with 0 and 1" should {
    "yield 0, 1, 2, 3, 5, 8, 13, ..." in {
      val it = new FibonacciIterator
      it.next must_== 0
      it.next must_== 1
      it.next must_== 1
      it.next must_== 2
      it.next must_== 3
      it.next must_== 5
      it.next must_== 8
      it.next must_== 13
      it.next must_== 21
    }
  }
}
