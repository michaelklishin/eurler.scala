package com.novemberain.euler

import annotation.tailrec

/**
 * A simplistic infinite Fibonacci sequence generator. It is not  a good example of careful design
 * but is sufficient for solving Project Euler problems.
 */
class FibonacciIterator extends Iterator[Long] {
  private var n: Long = 0

  def hasNext = true

  def next = {
    val r: Long = FibonacciIterator.fib(n)
    n += 1
    r
  }

}

object FibonacciIterator {
  def fib(n: Long) = fibTrampoline(n, 0, 1)

  @tailrec final def fibTrampoline(n: Long, a: Long, b: Long): Long = n match {
    case 0 => a
    case _: Long => fibTrampoline(n - 1, b, a + b)
  }
}
