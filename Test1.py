from pyspark import SparkConf,SparkContext
con=SparkConf()
sc=SparkContext(conf=con)

Rdd1=sc.parallelize([1,2,3,4,5,6,7,8,9,10,11,12])
Rdd1.saveAsTextFile("file:///home/cloudera/Parts")
