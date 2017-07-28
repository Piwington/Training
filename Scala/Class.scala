class Test(x:Int,y:Int){
	var a=x
	var b=y
	def show(){
		var c= a+b
		print ("Total is "+c)
	}
	println ("Collected Numbers")
	
	def this(a:Int,b:Int,c:String){
		this(a,b)
		println (c)
	}
}






var M=new Test(2,5,"Pie")
M.show()