from pyspark import SparkConf,SparkContext
con=SparkConf()
sc=SparkContext(conf=con)

MovIn=sc.textFile("file:///home/cloudera/Desktop/Movies.item")
Movie=MovIn.map(lambda x: x.encode("ascii", "ignore").split("|"))

RateIn=sc.textFile("file:///home/cloudera/Desktop/Moving-Ratings-Done.data")
Rate=RateIn.map(lambda x: x.encode("ascii", "ignore").split("\t"))

def Cou(x):
	Gen[0]=Gen[0]+int(x[5])
	Gen[1]=Gen[1]+int(x[6])
	Gen[2]=Gen[2]+int(x[7])
	Gen[3]=Gen[3]+int(x[8])
	Gen[4]=Gen[4]+int(x[9])
	Gen[5]=Gen[5]+int(x[10])
	Gen[6]=Gen[6]+int(x[11])
	Gen[7]=Gen[7]+int(x[12])
	Gen[8]=Gen[8]+int(x[13])
	Gen[9]=Gen[9]+int(x[14])
	Gen[10]=Gen[10]+int(x[15])
	Gen[11]=Gen[11]+int(x[16])
	Gen[12]=Gen[12]+int(x[17])
	Gen[13]=Gen[13]+int(x[18])
	Gen[14]=Gen[14]+int(x[19])
	Gen[15]=Gen[15]+int(x[20])
	Gen[16]=Gen[16]+int(x[21])
	Gen[17]=Gen[17]+int(x[22])
	Gen[18]=Gen[18]+int(x[23])
	return Gen



Gen=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
Sad=Movie.map(Cou)
Gen=Sad.collect()
print "Genres"
print "unknown: %s Action: %s Adventure: %s Animation: %s Children's: %s Comedy: %s Crime: %s Documentary: %s Drama: %s Fantasy: %s Film-Noir: %s Horror: %s Musical: %s Mystery: %s Romance: %s Sci-Fi: %s Thriller: %s War: %s Western: %s" %(Gen[1681][0],Gen[1681][1],Gen[1681][2],Gen[1681][3],Gen[1681][4],Gen[1681][5],Gen[1681][6],Gen[1681][7],Gen[1681][8],Gen[1681][9],Gen[1681][10],Gen[1681][11],Gen[1681][12],Gen[1681][13],Gen[1681][14],Gen[1681][15],Gen[1681][16],Gen[1681][17],Gen[1681][18])
