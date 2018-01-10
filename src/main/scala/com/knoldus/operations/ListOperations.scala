package com.knoldus.operations

class ListOperations {

  def findKthElement(nthElement: Int, list: List[Int]): Int = {

    list match {
      case head :: tail => {
        if (list.indexOf(head) == nthElement - 1) {
          head
        }
        else {
          findKthElement(nthElement - 1, tail)
        }
      }
      case head :: Nil => {
        if (list.indexOf(head) == nthElement) {

          head
        }
        else {
          0
        }
      }
    }

  }


  def numberOfElements(list: List[Int]): Int = {

  }


  def reverseList(list: List[Int]): List[Int] = {

    def reverseListHelper(list: List)

  }

}
