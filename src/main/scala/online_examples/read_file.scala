package online_examples

import org.apache.spark.sql.SparkSession

object read_file extends App{

  val spark = SparkSession.builder.
    master("local")
    .appName("spark session example")
    //    .enableHiveSupport()
    .getOrCreate()

  val grade_df=spark.read
    .format("csv")
    .option("header", "true")
    .load("src/main/scala/online_examples/dataset/grades.csv")

  println("example - 01")
  grade_df.show(false)

  //df function
  println("example - 02")
  grade_df.select("Firstname").show(false)

  import spark.implicits._

  println("example - 03")
  grade_df.filter(grade_df("Grade") ==="B-").show(false)
  //count function


}
