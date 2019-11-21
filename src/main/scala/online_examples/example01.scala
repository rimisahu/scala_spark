package online_examples


import org.apache.spark.sql.SparkSession

object example01 extends App{

  val spark = SparkSession.builder.
    master("local")
    .appName("spark session example")
//    .enableHiveSupport()
    .getOrCreate()

  import spark.implicits._

  val dataset = Seq((0, "hello"),(1, "world")).toDF("id","text")

  val upper: String => String =_.toUpperCase
  import org.apache.spark.sql.functions.udf

  val upperUDF = udf(upper)
  dataset.withColumn("upper", upperUDF('text)).show


}

//reference: https://www.edureka.co/blog/spark-sql-tutorial/
