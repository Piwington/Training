b=".txt"
D=input("Destination File Name: ")
if D.find(b)==-1:
	D=D+b
x=False
while x!=True:
	S=input("Source File Name: ")
	if S.find(b)==-1:
		S=S+b
	try:
		N=open(S,"r")
		F=N.read()
		N.close()
		x=True
	except:
		print("Invalid File")
N=open(D,"w")
N.close()
W=input("What Character Is Being Replaced: ")
R=input("Replace With: ")
N=open(D,"a")
for i in F:
	if i==W:
		N.write(R)
	else:
		N.write(i)
N.close()