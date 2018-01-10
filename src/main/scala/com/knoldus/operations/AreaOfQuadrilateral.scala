package com.knoldus.operations

class AreaOfQuadrilateral {


  def computeArea(shape: String, first: Int, second: Int,f: (Int, Int) => Int): String = {

    val shape2 = shape.toLowerCase
    shape2 match {
      case "rectangle" => {
        val area = f(first,second)
        val returnString = s"Area of $shape is $area"
        returnString
      }
      case "rhombus" => {
        val area = f(first,second)
        val returnString = s"Area of $shape is $area"
        returnString
      }
      case "parallelogram" => {
        val area = f(first,second)
        val returnString = s"Area of $shape is $area"
        returnString
      }
      case _ => {
        val returnString = s"Not yet defined for $shape"
        returnString
      }
    }
  }


}
