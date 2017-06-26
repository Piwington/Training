class ABC:
	def Mess(Self):
		Self.Add(7,2)
	def Add(Self,*A):
		X=0
		for x in A:
			X+=x
		print(X)
	def Add2(Self,A=0,B=0,C=0):
		D=A+B+C
		print(D)
Ref=ABC()
Ref.Mess()
Ref.Add(2,3,4,5,6)
Ref.Add2()
Ref.Add2(3,7)