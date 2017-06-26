No=int(input("Number: "))
if No>100:
	print("A")
	if No>500:
		print("1")
	else:
		print("2")
else:
	print("B")
	if No<50:
		print("4")
	else:
		print("3")