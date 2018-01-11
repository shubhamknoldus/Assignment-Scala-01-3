package com.knoldus.operations

class AddTwoListElements {
  def addTwoList(list1: List[Int], list2: List[Int]): List[Int] = {
    val lis: List[Int] = List()

    /*    if(list1.length == list2.length)
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
          }*/
    def addTwoListHelper(first: List[Int], second: List[Int]): Int = {
      if (first.length >= second.length) {
        second match {
          case head :: tail => {
            first match {
              case head2 :: tail2 => ((head + head2), addTwoListHelper(tail, tail2))
            }
          }
          case head :: Nil => {
            first match {
              case head2 :: tail => head + head2
            }
          }
        }
      }
      else {
        first match {
          case head :: tail => {
            second match {
              case head2 :: tail2 => (head + head2) :: addTwoListHelper(tail, tail2)
            }
          }
          case head :: Nil => {
            second match {
              case head2 :: tail => head + head2
            }
          }
        }
      }
    }

    lis ::: List(addTwoListHelper(list1, list2))

    lis
  }
}
