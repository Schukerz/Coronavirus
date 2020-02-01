package com.atguigui.spark.core.day01.singleValue

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object  Distinct {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Distinct").setMaster("local[2]")
    val sc = new SparkContext(conf)
    val list = List(30,40,50,10,70,60,10,20)
    val rdd: RDD[Int] = sc.parallelize(list,2)
    
  }

}
