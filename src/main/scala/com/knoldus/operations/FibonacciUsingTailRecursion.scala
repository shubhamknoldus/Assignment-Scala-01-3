package com.knoldus.operations

class FibonacciUsingTailRecursion {

  def printFibonacciTailRecursion(input: Int): Unit = {
    val counter = input

    def fiboGenerate(a: Int, b: Int, c: Int): Unit = {
      c match {
        case c if c < counter =>
          print(a + "\n")
          fiboGenerate(b, b + a, c + 1)
        case _ => print()
      }
    }

    fiboGenerate(0, 1, 0)
  }
}
