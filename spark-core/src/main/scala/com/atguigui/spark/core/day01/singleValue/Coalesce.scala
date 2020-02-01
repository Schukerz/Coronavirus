package com.atguigui.spark.core.day01.singleValue

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Coalesce {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setAppName("coalease").setMaster("local[*]")
    val sc = new SparkContext(conf)
    var list: List[Range.Inclusive] = List(1 to 10)
    val rng: Range.Inclusive = 1 to 19
    val rdd: RDD[Range.Inclusive] = sc.makeRDD(list,3)
    println(rdd.getNumPartitions)
//    val rdd2: RDD[Range.Inclusive] = rdd.coalesce(2,true)
    val rdd2: RDD[Range.Inclusive] = rdd.repartition(4)
    println(rdd2.getNumPartitions)

  }
}
