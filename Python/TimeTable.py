Start=int(input("Start At Table: "))
End=int(input("End At Table: "))
Range=int(input("Length Of Table: "))
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