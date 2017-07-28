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

schema=StructType(
	[
		StructField('ID', IntegerType(), True),
		StructField('Name', StringType(), True),
		StructField('Age', IntegerType(), True),
		StructField('Gender', StringType(), True),
		StructField('Marks', IntegerType(), True)
		]
	)
Prop=NH.map(lambda x: [int(x[0]),x[1],int(x[2]),x[3],int(x[4])])
DF=sql.createDataFrame(Prop,schema)

def mf(A):
	A=(A*100)/450
	return A

def grad(A):
	A=(A*100)/450
	if (A>=60):
		return "Pass"
	else:
		return "Fail"
MF=udf(mf,IntegerType())
GR=udf(grad,StringType())
DF.select("Name","Marks",MF("Marks").alias("Percentage"),GR("Marks").alias("Outcome")).show()

sql.udf.register("MF",mf)
DF.registerTempTable("TestT")
sql.sql("Select ID,Marks,MF(Marks) as Outcome from TestT").show()
