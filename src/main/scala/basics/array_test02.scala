package basics

import scala.collection.mutable.ArrayBuffer

object array_test02 extends App {

  //FIXED LENGTH ARRAY
  println("---------- 1")
  var data1 = new Array[Int](10)
  data1.foreach(println)

  println("---------- 2")
  val data2 = new Array[String](10)
  data2.foreach(println)

  println("---------- 3")
  val data3 = Array("test", "it")
  data3.foreach(println)


  //VARIABLE LENGTH ARRAY
  println("---------- 4")
  val arrayBuff1 = ArrayBuffer[Int]()
  arrayBuff1.foreach(println)

  println("---------- 5")
  arrayBuff1 += 1
  arrayBuff1.foreach(println)

  println("---------- 6")
  arrayBuff1 += (2, 3, 4, 5)
  arrayBuff1.foreach(println)

  println("---------- 7 append array, array buffer")
  arrayBuff1 ++= //Array(7,6,7)
    ArrayBuffer(8, 9, 0)
  arrayBuff1.foreach(println)


  println("---------- 8 trim (** not working)")

  val arrayBuff2 = ArrayBuffer(9, 10, 5, 3, 2)
  arrayBuff2.trimEnd(3)
  printArr(arrayBuff2)


  println("---------- 9 insert")
  val arrayBuff3 = ArrayBuffer(9, 10)
  printArr(arrayBuff3)
  arrayBuff3.insert(0, 8)  // 0 is the position, 8 is the element to be inserted
  printArr(arrayBuff3)
  arrayBuff3.insert(2, 99) // 2 is the position, 99 is the element to be inserted
  printArr(arrayBuff3)


  println("---------- 9 remove")
  val arrayBuff4 = ArrayBuffer(9, 10, 1, 4, 5, 3, 2)
  printArr(arrayBuff4)
  arrayBuff4.remove(2)  // removes 3nd element
  printArr(arrayBuff4)
  arrayBuff4.remove(1,3)  // removes 3 elments, starting 2nd element
  printArr(arrayBuff4)


  def printArr(arrVal: ArrayBuffer[Int]) {
    var fullString = ""
    for (xx <- arrVal) {
      fullString = fullString + xx.toString + ","
    }
    println(fullString)

  }


}
