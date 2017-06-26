class Pie(object):
	def check(self):
		print('A')
class Die(Pie):
	def P(P):
		print('B')
class SD(Pie):
	def P(P):
		print('C')
class D(SD,Die):
	pass
ref=D()
ref.check() 
ref.P()