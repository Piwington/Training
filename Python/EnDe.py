b=".txt"
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
N=open(S,"w")
N.close()
Check=input("Encrypt/Decrypt: ")
N=open(S,"a")
if Check=="Encrypt":
	for i in F:
		a=(ord(i)+90)
		a=chr(a)
		N.write(a)
elif Check=="Decrypt":
	for i in F:
		a=(ord(i))-90
		a=chr(a)
		N.write(a)
N.close()