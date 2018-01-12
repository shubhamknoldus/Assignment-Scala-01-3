package com.knoldus.operations

class AddTwoListElements {
  def addTwoList(list1: List[Int], list2: List[Int]): List[Int] = {

    (list1 zip list2).map(x => x._1 + x._2)

  }
}
