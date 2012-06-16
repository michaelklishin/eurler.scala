package com.novemberain.euler

import org.specs2.mutable.Specification

class PalindromsSpec extends Specification {
  "101, 1001, 9009, 98988989" should {
    "be palindroms" in {
      Palindroms.isPalindrome(101) must beTrue
      Palindroms.isPalindrome(1001) must beTrue
      Palindroms.isPalindrome(9009) must beTrue
      Palindroms.isPalindrome(98988989) must beTrue
    }
  }
}
