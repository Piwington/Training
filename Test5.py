from pyspark import SparkConf,SparkContext
con=SparkConf()
sc=SparkContext(conf=con)

MovIn=sc.textFile("file:///home/cloudera/Desktop/Movies.item")
Movie=MovIn.map(lambda x: x.encode("ascii", "ignore").split("|"))

RateIn=sc.textFile("file:///home/cloudera/Desktop/Moving-Ratings-Done.data")
Rate=RateIn.map(lambda x: x.encode("ascii", "ignore").split("\t"))

UserIn=sc.textFile("file:///home/cloudera/Users.txt")
header=UserIn.take(1)[0]
UserH=UserIn.filter(lambda x:x != header)
User=UserH.map(lambda x: x.encode("ascii", "ignore").split("|"))

def Under(x):
	if int(x[1])<=18:
		return True
	else:
		return False



def ExtractUser(x):
	A=[]
	for a in x:
		A.extend([a[0]])
	return A
UserShort=User.filter(Under).collect()
UserList=ExtractUser(UserShort)


def Match(x):
	for x[0] in UserList:
		return True
	else:
		return False

RateShort=Rate.filter(Match)
RateList=RateShort.map(lambda x: (x[1],x[2])).countByKey()

Z=0
MovieList=Movie.collect()
for z in MovieList:
	if RateList[z[0]]>Z:
		Z=RateList[z[0]]
		Name=z[1]
print "The Most Popular Movie For Under 19s Is %s With %s Ratings" %(Name,Z)

Genre={}
for g in MovieList:
	Genre[g[0]]=[int(g[5]),int(g[6]),int(g[7]),int(g[8]),int(g[9]),int(g[10]),int(g[11]),int(g[12]),int(g[13]),int(g[14]),int(g[15]),int(g[16]),int(g[17]),int(g[18]),int(g[19]),int(g[20]),int(g[21]),int(g[22]),int(g[23])];

SemiGenre={}
for p in MovieList:
	F=RateList[p[0]]
	Add=Genre[p[0]]
	SemiGenre[p[0]]=[(F*Add[0]),(F*Add[1]),(F*Add[2]),(F*Add[3]),(F*Add[4]),(F*Add[5]),(F*Add[6]),(F*Add[7]),(F*Add[8]),(F*Add[9]),(F*Add[10]),(F*Add[11]),(F*Add[12]),(F*Add[13]),(F*Add[14]),(F*Add[15]),(F*Add[16]),(F*Add[17]),(F*Add[18])]

TotalGenre=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
for j in MovieList:
	Tot=SemiGenre[j[0]]
	TotalGenre=[(TotalGenre[0]+Tot[0]),(TotalGenre[1]+Tot[1]),(TotalGenre[2]+Tot[2]),(TotalGenre[3]+Tot[3]),(TotalGenre[4]+Tot[4]),(TotalGenre[5]+Tot[5]),(TotalGenre[6]+Tot[6]),(TotalGenre[7]+Tot[7]),(TotalGenre[8]+Tot[8]),(TotalGenre[9]+Tot[9]),(TotalGenre[10]+Tot[10]),(TotalGenre[11]+Tot[11]),(TotalGenre[12]+Tot[12]),(TotalGenre[13]+Tot[13]),(TotalGenre[14]+Tot[14]),(TotalGenre[15]+Tot[15]),(TotalGenre[16]+Tot[16]),(TotalGenre[17]+Tot[17]),(TotalGenre[18]+Tot[18])]

T=0
K=0
k=['unknown','Action','Adventure','Animation','Children','Comedy','Crime','Documentary','Drama','Fantasy','Filn-Noir','Horror','Musical','Mystry','Romance','Sci-Fi','Thriller','War','Western']
for t in TotalGenre:
	if t>T:
		pr=k[K]
		T=t
	K=K+1
print "Most Popular Genre is %s with %s ratings" %(pr,T)
