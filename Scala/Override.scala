class One{
	def M(){
		print ("Chicken")
	}
}

class Two extends One{
	override def M(){
		print ("Pie")
	}
}

var A=new Two()
var B=new One()
A.M()
B.M()