from pyspark import SparkConf,SparkContext
con=SparkConf()
sc=SparkContext(conf=con)

MovIn=sc.textFile("file:///home/cloudera/Desktop/Movies.item")
Movie=MovIn.map(lambda x: x.encode("ascii", "ignore").split("|"))

RateIn=sc.textFile("file:///home/cloudera/Desktop/Moving-Ratings-Done.data")
Rate=RateIn.map(lambda x: x.encode("ascii", "ignore").split("\t"))

MovieShort=Movie.map(lambda x: (x[0],x[1])).collect()

for A in MovieShort:
	if "GoldenEye" in A[1]:
		Id=A[0]
		Name=A[1]


def Level(x):
	if (x[1]==Id)&(x[2]=='5'):
		return True
	else:
		return False

RateId=Rate.filter(Level)
Num=str(RateId.count())

print "%s has a total of %s, 5 Star ratings" %(Name,Num)
