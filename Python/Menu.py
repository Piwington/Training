def TimesTable(Start,End,Range):
	if Start>End:
		while Start>=End:
			print("")
			Count=1
			print("Time Table Of %d" %Start)
			while Count<=Range:
				Total=Count*Start
				print("%d x %d = %d" %(Start, Count, Total))
				Count+=1
			Start-=1
	else:
		if Start<=End:
			while Start<=End:
				print("")
				Count=1
				print("Time Table Of %d" %Start)
				while Count<=Range:
					Total=Count*Start
					print("%d x %d = %d" %(Start, Count, Total))
					Count+=1
				Start+=1
def Add(D,E):
	C=D+E
	print("%d + %d = %d" %(D,E,C))
def Sub(D,E):
	C=D-E
	print("%d - %d = %d" %(D,E,C))
def Div(D,E):
	C=D/E
	print("%d / %d = %d" %(D,E,C))
def Mul(D,E):
	C=D*E
	print("%d * %d = %d" %(D,E,C))
def Enter(Z):
	A=int(input("First Number: "))
	B=int(input("Second Number: "))
	if Z==5:
		C=int(input("Table Length: "))
	else:
		C=0
	return A,B,C
while True:
	print("1-Addition")
	print("2-Subtraction")
	print("3-Division")
	print("4-Multiplication")
	print("5-TimesTable")
	print("6-Quit")
	Y=False
	Z=int(input("Enter Your Choice: "))
	if Z==6:
		break
	while Y==False:
		if 0<Z<7:
			D,E,F=Enter(Z)
			if Z==5:
				TimesTable(D,E,F)
			elif Z==4:
				Mul(D,E)
			elif Z==3:
				Div(D,E)
			elif Z==2:
				Sub(D,E)
			elif Z==1:
				Add(D,E)
			X=input("Calculate Again? (Yes/No) ")
		else:
			break
		if X=="No":
			Y=True