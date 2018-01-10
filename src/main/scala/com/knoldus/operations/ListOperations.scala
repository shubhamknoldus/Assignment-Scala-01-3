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

    val counter = 0
    def numberOfElementsHelper(list: List[Int], count: Int): Int ={
      list match{
        case first :: tail => {
          numberOfElementsHelper(tail,count + 1)
        }
        case first :: Nil => count + 1
        case Nil => count
      }
    }
    val countReal = numberOfElementsHelper(list,counter)
    countReal
  }


/*  def reverseList(list: List[Int]): List[Int] = {


  }*/

}
