I=input("File Name: ")
F=open(I,"r")
import random
import string
unencrypted=F.read()
K=''.join([random.choice(string.ascii_letters + string.digits) for n in range(len(unencrypted))])
T=open("Temp.txt","w")
T.close()
T=open("Temp.txt","a")
T.write(K)
T.close()
x=0
while x<len(unencrypted):
	encrypted=unencrypted.replace(,K(x))
	x=x+1
F.close()
F=open(I,"w")
F.write(encrypted)
F.close()