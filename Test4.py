from pyspark import SparkConf,SparkContext
con=SparkConf()
sc=SparkContext(conf=con)

MovIn=sc.textFile("file:///home/cloudera/Desktop/Movies.item")
Movie=MovIn.map(lambda x: x.encode("ascii", "ignore").split("|"))

RateIn=sc.textFile("file:///home/cloudera/Desktop/Moving-Ratings-Done.data")
Rate=RateIn.map(lambda x: x.encode("ascii", "ignore").split("\t"))

MovieShort=Movie.map(lambda x: (x[0],x[1])).collect()
def Level(x):
	if x[2]=='5':
		return True
	else:
		return False

Max=["",0]
RateShort=Rate.filter(Level)

def Cou(x):
	if x[1]==Id:
		return True
	else:
		return False

for A in MovieShort:
	Id=A[0]
	Name=A[1]
	Num=RateShort.filter(Cou).count()
	if Num>Max[1]:
		Max[0]=Name
		Max[1]=Num






print "%s has a total of %s, 5 Star ratings and this is the most 5 Star ratings of all movies" %(Max[0],Max[1])
