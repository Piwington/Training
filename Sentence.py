Sentence=input("Enter a Sentence: ")
Up="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
Lo="abcdefghijklmnopqrstuvwxyz"
a=0
while a<26:
	z=0
	for x in Sentence:
		if (x==Up[a])|(x==Lo[a]):
			z=z+1
	if z!=0:
		print("%s = %d" %(Up[a],z))
	a=a+1