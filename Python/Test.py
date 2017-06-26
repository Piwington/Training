No1=input("First Number: ")
No2=input("Second Number: ")
No3=int(No1)+int(No2)
print("%s + %s = %d" %(No1,No2,No3))
if No3>10:
	print("Good: %d>10" %No3)
else:
	print("Bad: Answer is too Small")