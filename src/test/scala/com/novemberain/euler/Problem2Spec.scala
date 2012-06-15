package com.novemberain.euler

import org.specs2.mutable.Specification

class Problem2Spec extends Specification {
  "the sum of all of the even-valued Fibonacci sequence values that do not exceed 4 million" should {
    "equal 4613732" in {
      val it = new FibonacciIterator
      val r = it.takeWhile(_ < 4000000).filter(_ % 2 == 0).sum
      r should_== 4613732
    }
  }
}
