Salary=int(input("Salery Per Year: "))
while True:
	Grade=int(input("Grade (1-20): "))
	if 1<=Grade<=20:
		break
	else:
		print("Range Is 1-20 Try Again")
while True:
	Dept=input("Department (IT or HR): ")
	if (Dept=="IT")|(Dept=="HR"):
		break
	else:
		print("Enter Correct Department")
while True:
	CTO=input("Are You A CTO: ")
	if (CTO=="Yes")|(CTO=="No"):
		break
	else:
		print("Yes Or No")
if Dept == "IT":
	if CTO=="Yes":
		Tax=0
	else:
		if 1<=Grade<11:
			Tax=9
		else:
			Tax=15
	Bonus=5
else:
	if CTO=="Yes":
		Tax=2
	else:
		if 1<=Grade<11:
			Tax=9
		else:
			Tax=17
	Bonus=0
Total=Salary+(Salary*(Bonus/100))
Output=Salary*(Tax/100)
print("Total Salary %d" %Total)
print("Tax Payable Is: %d" %Output)