package com.novemberain.euler

import org.specs2.mutable.Specification

class EvenDivisionSpec extends Specification {
  "20" should {
    "be evenly divisable by 1, 2, 4, 5, 10 and 20" in {
      EvenDivision.isEvenlyDivisable(20, 1) must beTrue
      EvenDivision.isEvenlyDivisable(20, 2) must beTrue
      EvenDivision.isEvenlyDivisable(20, 4) must beTrue
      EvenDivision.isEvenlyDivisable(20, 5) must beTrue
      EvenDivision.isEvenlyDivisable(20, 6) must beFalse

      EvenDivision.isEvenlyDivisableByAll(20, List(1, 2, 4, 5, 10, 20)) must beTrue
      EvenDivision.isEvenlyDivisableByAll(20, List(1, 2, 3, 8)) must beFalse
    }
  }
}
