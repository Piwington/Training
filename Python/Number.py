String=""
def N(A,String):
	Key={1:"One",2:"Two",3:"Three",4:"Four",5:"Five",6:"Six",7:"Seven",8:"Eight",9:"Nine"}
	for a in Key:
		if A==a:
			String=Key[a] + " " + String
			return String
def N2(A,String):
	Key={2:"Twenty",3:"Thirty",4:"Fourty",5:"Fifty",6:"Sixty",7:"Seventy",8:"Eighty",9:"Ninety"}
	for a in Key:
		if A==a:
			String=Key[a]+" "+String
			return String
def Teen(A,String):
	Key={0:"Ten",1:"Eleven",2:"Twelve",3:"Thirteen",4:"Fourteen",5:"Fifteen",6:"Sixteen",7:"Seventeen",8:"Eighteen",9:"Nineteen"}
	for a in Key:
		if A==a:
			String=Key[a]+" "+String
			return String
def Triple(A,String):
	Key={1:"Thousand ",2:"Million ",3:"Billion ",4:"Trillion "}
	for a in Key:
		if (A==a):
			String=Key[a]+String
			return String
print(" ")
Num=int(input("Enter Number Between 1-9999: "))
D=0
E=0
print(" ")
if Num<0:
	Neg=True
	Num=-Num
else:
	Neg=False
if (Num==0):
	print("Zero")
while (Num!=0)|(D!=0):
	D=int(Num/1000)
	A=int(Num%10)
	Num=Num/10
	B=int(Num%10)
	Num=Num/10
	C=int(Num%10)
	Num=int(Num/10)
	if (E!=0)&((A!=0)|(B!=0)|(C!=0)):
		String=Triple(E,String)
	E+=1
	if (B!=1)&(A!=0):
		String=N(A,String)
	if B==1:
		String=Teen(A,String)
	elif B!=0:
		String=N2(B,String)
	if ((B!=0)|(A!=0))&((D!=0)|(C!=0)):
			String="And "+String
	if C!=0:
		String="Hundred "+String
		String=N(C,String)
if Neg==True:
	String="Negative "+String
print(String)