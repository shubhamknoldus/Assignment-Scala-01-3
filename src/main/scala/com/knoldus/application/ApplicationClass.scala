package com.knoldus.application

import com.knoldus.operations.DoubleAllListElements
import com.knoldus.operations.AreaOfQuadrilateral
import com.knoldus.operations.ListOperations
import org.apache.log4j.Logger

object ApplicationClass extends App {

  val log = Logger.getLogger(this.getClass)

  val listElement1 = 45
  val listElement2 = 23
  val listElement3 = 89
  val listElement4 = 34
  val listElement5 = 56
  val listElement6 = 76
  val listElement7 = 12

  val listElement8 = 90

  val listToBeDoubled = List(listElement1, listElement2, listElement3, listElement4,
    listElement5, listElement6, listElement7, listElement8)
  val doubleListObject = new DoubleAllListElements
  log.info(doubleListObject.doubleListElements(listToBeDoubled) + "\n")



  val x = new AreaOfQuadrilateral
  val length = 23
  val breath = 34
  val shape = "rectangle"
  log.info(x.computeArea(shape, length, breath, (a, b) => (a * b)) + "\n" )

  val listOperation = new ListOperations
  log.info(listOperation.numberOfElements(listToBeDoubled))

  val ele = 5




  log.info(listOperation.findKthElement(ele,listToBeDoubled))
}
