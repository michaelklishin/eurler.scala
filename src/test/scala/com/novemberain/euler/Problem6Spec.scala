package com.novemberain.euler

import org.specs2.mutable.Specification

class Problem6Spec extends Specification {
  "the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum" should {
    "equal 25164150" in {
      val range = Range(0, 101)
      val s = range.sum
      val r = s * s - range.map((i: Int) => i*i).sum
      r should_== 25164150
    }
  }
}
