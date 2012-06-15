package com.novemberain.euler

import org.specs2.mutable.Specification

class Problem3Spec extends Specification {
  "the largest prime factor of the number 600851475143" should {
    "equal 6857" in {
      val r = Factors.greatestFactor(600851475143L, 2)
      r should_== 6857
    }
  }
}
