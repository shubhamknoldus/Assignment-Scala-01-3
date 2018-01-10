package com.knoldus.operations

class AddTwoListElements {
  def addTwoList(list1: List[Int], list2: List[Int]): List[Int] = {
      val lis: List[Int] = List()
    if(list1.length == list2.length)
      {
        list1 match {
          case head1 :: tail => {
            list2 match {
              case head2 :: tail => {
                head1 + head2 :: lis
              }
            }
          }
          case head1 :: Nil => {
            list2 match {
              case head2 :: Nil => {
                head1 + head2 :: lis
              }
            }
          }
        }
      }
    lis
  }
}
