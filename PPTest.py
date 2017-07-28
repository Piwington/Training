from pyspark import SparkConf,SparkContext,SQLContext
from pyspark.sql.types import *
from pyspark.sql.functions import udf

con=SparkConf()
sc=SparkContext(conf=con)
sql=SQLContext(sc)
Input=sc.textFile("file:///home/cloudera/Comp.txt")
InputSplit=Input.map(lambda x: x.split("|"))
header=InputSplit.take(1)[0]
NH=InputSplit.filter(lambda x:x != header)


DF=sql.createDataFrame(NH)
DF.show()
DF.printSchema()

DF.select(DF._1.alias("ID")).show()
#set DF= to rename or it is just temporary

DF.select("_1").show()
Y=DF.select("_1","_2").collect()
print(Y)
DF.select((DF._1*100).alias("Test")).show()

DF.filter(DF._1>2).show()
DF.filter((DF._1>1)&(DF._1<3)).show()
DF.filter(DF._1.between(1,3)).show()

DF.sort(DF._3).show()
DF.sort(DF._5.asc()).show()
#_5 is a String so numbers must be equal length to work

DF.sort(DF._1.desc()).show()

DF=sql.createDataFrame(NH,header)
DF.show()

schema=StructType(
	[
		StructField('ID', LongType(), True),
		StructField('Name', StringType(), True),
		StructField('Age', LongType(), True),
		StructField('Gender', StringType(), True),
		StructField('Marks', LongType(), True)
		]
	)
Prop=NH.map(lambda x: [int(x[0]),x[1],int(x[2]),x[3],int(x[4])])
DF=sql.createDataFrame(Prop,schema)
DF.show()
DF.sort(DF.Marks.asc()).show()
#_5//Marks is now a int so sorts properly

print(DF.dtypes)
DF.printSchema()

DF.select("Name","Age").orderBy(DF.Age.desc()).show()
