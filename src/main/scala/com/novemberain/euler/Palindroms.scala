package com.novemberain.euler

object Palindroms {
  def isPalindrome[A](x: A) = {
    val s = x.toString
    (s == s.reverse)
  }
}
