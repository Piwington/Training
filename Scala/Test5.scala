import pyspark.sql.*
sql=sqlContext(sc)
Rdd1=sc.TextFile("Data.txt")
Rdd2=Rdd1.map(lambda x: x.split("|"))
DF=sql.createDataFrame(Rdd2)
DF.show()
DF.printSchema()