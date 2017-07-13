from pyspark import SparkConf,SparkContext
con=SparkConf()
sc=SparkContext(conf=con)

Rdd1=sc.textFile("file:///home/cloudera/Train1.txt")
Rdd3=Rdd1.map(lambda x: x.encode("ascii", "ignore"))

Rdd2=sc.textFile("file:///home/cloudera/Train2.txt")
Rdd4=Rdd2.map(lambda x: x.encode("ascii", "ignore"))

print Rdd3.union(Rdd4).distinct().collect()
print Rdd3.intersection(Rdd4).collect()
print Rdd3.subtract(Rdd4).collect()





Rdd167=sc.textFile("file:///home/cloudera/Crap.txt")
header=Rdd167.take(1)[0]
Rdd16=Rdd167.filter(lambda x:x != header)
Rdd162=Rdd16.map(lambda x: x.encode("ascii", "ignore").split(","))

Rdd5=sc.textFile("file:///home/cloudera/CrapI.txt")
header=Rdd5.take(1)[0]
Rdd6=Rdd5.filter(lambda x:x != header)
Rdd7=Rdd6.map(lambda x: x.encode("ascii", "ignore").split(","))

def Sp(a):
	return a[0],a[2]
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

def Per(a):
	a=list(a)
	a[1]=(a[1]*100)/450
	return a
Rdd18=Rdd17.map(Per)

print Rdd7.map(lambda x: x[0]).collect()
print Rdd7.map(lambda x: x[1]).collect()
print Rdd7.map(lambda x: x[2]).collect()
print Rdd17.map(lambda x: x[1]).collect()
print Rdd18.map(lambda x: x[1]).collect()
def Grad(a):
	if a>=90:
		print "Grade: A*"
	elif 80<=a<90:
		print "Grade: A"
	elif 70<=a<80:
		print "Grade: A"
	elif 60<=a<70:
		print "Grade: A"
	elif a<60:
		print "Grade: Fail"
Rdd8=Rdd7.collect()
Rdd9=Rdd17.collect()
Rdd10=Rdd18.collect()
for A in Rdd8:
	print "RegNo: %s" %A[0]
	print "Name: %s" %A[1]
	print "Address: %s" %A[2]
	for B in Rdd9:
		if B[0]==A[0]:
			print "Total Marks: %s" %B[1]
	for C in Rdd10:
		if C[0]==A[0]:
			print "Percentage: %s"  %C[1]
			Grad(C[1])
			Z=1
	if Z==0:
		print "Didn't Have All Three Marks"
	else:
		Z=0
