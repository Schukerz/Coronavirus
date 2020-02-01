package com.atguigui.spark.core.day01.singleValue

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object reateRDD {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("hello")
    val sc: SparkContext = new SparkContext(conf)
//    val rdd: RDD[Int] = sc.parallelize(Array(10,30,40,20))
    val rdd: RDD[Char] = sc.parallelize("hello")
    rdd.foreach(println)
    sc.stop()
  }
}
