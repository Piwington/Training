class One{
	def Tall(){
		print ("One Tall")
	}
	def Short(){
	print ("One Short")
	}
}
class Two extends One{
	override def Tall(){
	print ("Two Tall")
	}
	//def Short(){
	//print ("Two Short")
	//}
}
class Three{
	def Tall(){
		print ("Three Tall")
	}
	def Short(){
	print ("Three Short")
	}
}
var x:One=new Two()
//var y:One=new Three()
x.Tall()
x.Short()