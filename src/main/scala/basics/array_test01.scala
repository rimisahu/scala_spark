package basics

import org.apache.spark.sql.SparkSession

import scala.Array._

object array_test01 extends App {

  //  val spark = SparkSession.builder.
  //    master("local")
  //    .appName("spark basics practice")
  //    .getOrCreate()

  //  println( util.Properties.versionString) // version 2.11.12

  val arrVal01 = new Array[Int](4)
  println(arrVal01(0))
  println(arrVal01(1))
  println(arrVal01(2))
  println(arrVal01(3))

  println("----------")
  val arrVal02 = Array(22, 31, 55, 23, 9)
  println(arrVal02(0))
  println(arrVal02(1))
  println(arrVal02(2))
  println(arrVal02(3))
  println(arrVal02(4))

  println("----------")

  for (i <- arrVal02) {
    println(i)
  }

  println("----------")
  var totalCount = 0
  for (i <- arrVal02) {
    totalCount += i
    println("total sum: " + totalCount)
  }

  println("---------- concat two arrays")
  // instead of Array.concat, one can also run following first
  //  import Array._
  val arrVal03 = Array.concat(arrVal01, arrVal02)
  printArr(arrVal03)

  println("---------- merge two arrays")
  val arrVal03a = arrVal01 ++ arrVal02
  printArr(arrVal03a)

  println("---------- Append add an element to an array")
  val arrVal04 = arrVal02 :+ 8
  printArr(arrVal04)

  println("---------- PREpend an element to an array")
  val arrVal05 = 8 +: arrVal02
  printArr(arrVal05)

  println("---------- Multi dimensional array")
  var arrVal06 = ofDim[Int](3, 3)
  for (i <- 0 to 2) {
    for (j <- 0 to 2) {
      arrVal06(i)(j) = i + j
    }
  }

  println("---------- array range")
  var arrVal07 = Array.range(0, 7)
  printArr(arrVal07)

  println("---------- array fill")
  var arrVal08 = Array.fill(6)("hope")
  printArr(arrVal08)


  println("---------- to array ")
  var arrVal09 = "hope".toArray
  arrVal09.foreach(println)


  println("---------- array length ")
  println(arrVal09.length)





  def printArr(arrVal: Array[Int]) {
    var fullString = ""
    for (xx <- arrVal) {
      fullString = fullString + xx.toString + ","
    }
    println(fullString)

  }

  def printArr(arrVal: Array[String]) {
    var fullString = ""
    for (xx <- arrVal) {
      fullString = fullString + xx + ","
    }
    println(fullString)

  }


}


