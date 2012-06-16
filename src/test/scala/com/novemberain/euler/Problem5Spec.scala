package com.novemberain.euler

import org.specs2.mutable.Specification

import EvenDivision.isEvenlyDivisableByAll

class Problem5Spec extends Specification {
  "the smallest positive number that is evenly divisible by all of the numbers from 1 to 20" should {
    "be equal 232792560" in {
      val dividers = Range(1, 21)
      // by the problem definition we are allows to step in 20. We star at 20 due to the fact
      // that 0 is evenly divisible by any set of numbers.
      Range(20, Int.MaxValue, 20).dropWhile(!isEvenlyDivisableByAll(_, dividers)).head must_== 232792560
    }
  }
}
