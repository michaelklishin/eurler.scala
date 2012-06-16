package com.novemberain.euler

import org.specs2.mutable.Specification

import Palindroms.isPalindrome

class Problem4Spec extends Specification {
  "the largest palindrome made from the product of two 3-digit numbers" should {
    "equal 906609" in {
      val pairs = for(x <- 1 to 999; y <- 1 to 999) yield Pair(x, y)
      pairs.map{case(a, b) => a * b}.filter(isPalindrome).max should_== 906609
    }
  }
}
