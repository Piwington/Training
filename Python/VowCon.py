Vow="QAConsulting"
Con="Office for National Statistics"
List="aAeEiIoOuU"
for x in Vow:
	if x in List:
		print (x)
for x in Con:
	if (x in List)|(x==" "):
		pass
	else:
		print(x)