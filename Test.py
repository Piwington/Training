from pyspark import SparkConf,SparkContext
con=SparkConf()
sc=SparkContext(conf=con)
list1=[23,64,2,5,76]
Rdd1=sc.parallelize(list1)
data=Rdd1.collect()
for A in data:
	print(A)
def Hat(v):
	if v%2==0:
		a='Even'
	else:
		a='Odd'	
	return a;
add=Rdd1.map(Hat)
data=add.collect()
print(data)

list2=[1,4,5,6,3,3,2,6,8,9,3,2,5,2,1,4]
Rdd2=sc.parallelize(list2)
Num=Rdd2.count()
Data=Rdd2.countByValue()
print(Num)
for A in Data:
	print A,"-",Data[A]
def check (x):
	if x%2==0:
		return True
	else:
		return False
Rdd3=Rdd2.filter(check)
print(Rdd3.collect())

Rdd4=sc.textFile("file:///home/cloudera/Users.txt")
header=Rdd4.take(1)[0]
Rdd5=Rdd4.filter(lambda x:x != header)

def BreakRecord (R):
	Rec=R.split("|")
	if Rec[2]=="M":
		return True
	else:
		return False

Rdd6=Rdd5.filter(BreakRecord)
print(Rdd6.count())
print((Rdd5.count()-Rdd6.count()))

def BreakRecord2 (R):
	Rec=R.split("|")
	return(Rec[3])
Rdd7=Rdd5.map(BreakRecord2)
print(Rdd7.distinct().count())

Rdd8=Rdd7.countByValue()
print Rdd8
for A in Rdd8:
	print A,Rdd8[A]

def dec (A,B):
	return A*B
print(Rdd2.reduce(dec))

Rdd10=sc.parallelize([("Boop",24),("Beep",45),("Look",73),("Leep",23)])
def Ago (s):
	S=(s-3)/2
	return S
Rdd11=Rdd10.mapValues(Ago)
print Rdd11.collect()

Rdd13=Rdd5.map(lambda x: x.encode("ascii", "ignore"))
def sep (x):
	X=x.split("|")
	return X[0],X[1]
Rdd14=Rdd13.map(sep)
Rdd15=Rdd14.mapValues(lambda x: (int(x)-3)/2)
print Rdd15.collect()


Rdd16=sc.textFile("file:///home/cloudera/Crap.txt")
Rdd162=Rdd16.map(lambda x: x.encode("ascii", "ignore"))
def Sp(a):
	A=a.split(",")
	return A[0],A[2]
Rdd161=Rdd162.map(Sp)
def Add(s,d):
	A=int(s)+int(d)
	return A

Rdd18=Rdd161.countByKey()
def Fil(a):
	A=a[0]
	if Rdd18[A]==3:
		return True
	else:
		return False

Rdd171=Rdd161.filter(Fil)

Rdd17=Rdd171.reduceByKey(Add)
print Rdd17.collect()
def Per(a):
	a=list(a)
	a[1]=(a[1]*10)/3
	return a
Rdd18=Rdd17.map(Per)
print Rdd18.collect()
Z=Rdd161.map(lambda x: x[0]).distinct().count()
z=Rdd17.map(lambda x: x[0]).distinct().count()
print (Z-z)
def fail(a):
	if a[1]>50:
		return True
	else:
		return False
Rdd19=Rdd18.filter(fail)
Y=Rdd19.map(lambda x: x[0]).distinct().count()
print (z-Y)
print (Y)
