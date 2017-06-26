X={1:"Man",2:"Woman",3:"Hermaphrodite"}
Y={"Age":19,"Height":1.60,"Gender":"Man"}
for a in X:
	for b in Y:
		if X[a]==Y.get(b):
			print(X[a])