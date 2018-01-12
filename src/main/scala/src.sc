import java.util.Random



abstract class Element {
  def put() = {
    println("hi")
  }
}

class ArrayEle extends Element {
  override def put(): Unit = println("hi ffrom Array")
}



class ArrayElement(conts: Array[String]) extends Element{
  val contents: Array[String] = conts
}