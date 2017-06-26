class ONE:
	def __init__(self,a,b,c):
		self.a=a
		self.b=b
		self.c=c
	def __add__(self,r):
		self.d=ONE(0,0,0)
		self.d.a=self.a+r.a
		self.d.b=self.b+r.b
		self.d.c=self.c+r.c
		return self.d
	def __str__(self):
		return str(self.a)+" "+str(self.b)+" "+str(self.c)
a=ONE(1,2,3)
b=ONE(10,20,30)
X=a+b
print(X)