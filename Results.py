class Results:
	def __init__(self,x=0,y=0,z=0):
		self.__phy=x
		self.__che=y
		self.__bio=z
	def chemistry(self,a):
		if 0<=a<=150:
			self.__che=a
			self.__perche=self.__che/150
		else:
			print("Invalid Result")
	def physics(self,a):
		if 0<=a<=150:
			self.__phy=a
			self.__perphy=self.__phy/150
		else:
			print("Invalid Result")
	def biology(self,a):
		if 0<=a<=150:
			self.__bio=a
			self.__perbio=self.__bio/150
		else:
			print("Invalid Result")
	def __calc(self):
		self.__total=self.__phy+self.__che+self.__bio
		self.__totper=self.__total/450*100
		a=0
		if self.__perphy<0.40:
			a=a+1
		if self.__perche<0.40:
			a=a+1
		if self.__perbio<0.40:
			a=a+1
		self.__pas=a
	def result(self):
		self.__calc()
		print("Total = %d/450" %self.__total)
		print("Percentage = %d" %self.__totper)
		if self.__pas==0:
			print("Total Success")
		elif self.__pas==1:
			print("Retake Exam")
		elif self.__pas==2:
			print("Retake Year")
		elif self.__pas==3:
			print("Just Go Home")
Harry=Results()
Harry.physics(int(input("Enter Physics Exam Result: ")))
Harry.biology(int(input("Enter Biology Exam Result: ")))
Harry.chemistry(int(input("Enter Chemistry Exam Result: ")))
Harry.result()