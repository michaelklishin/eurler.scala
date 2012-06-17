package com.novemberain.euler

import org.specs2.mutable.Specification

class Problem7Spec extends Specification {
  "10,001th prime number" should {
    "equal 104743" in {
      val r = Primes.upToNth(1000000)(10000)
      r should_== 104743
    }
  }
}
