package com.novemberain.euler

import org.specs2.mutable._

class Problem1Specs extends Specification {

  "the sum of all the multiples of 3 or 5 below 1000" should {
    "equal 233168" in {
      val divisibleBy3 = Range(0, 1000, 3)
      val divisibleBy5 = Range(0, 1000, 5)
      val divisibleBy15 = Range(0, 1000, 15)

      (divisibleBy3.sum + divisibleBy5.sum - divisibleBy15.sum) must beEqualTo(233168)
    }
  }
}
