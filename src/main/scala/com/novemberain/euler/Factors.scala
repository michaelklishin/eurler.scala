package com.novemberain.euler

object Factors {
  def isFactor(a: Long, b: Long) = (a % b) == 0

  def greatestFactor(n: Long, current: Long): Long = {
    (n == current) match {
      case true => n
      case false => {
        isFactor(n, current) match {
          case true  => greatestFactor(n / current, current)
          case false => greatestFactor(n, current + 1)
        }
      }
    }
  }
}
