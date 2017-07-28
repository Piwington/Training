class Results{
	private var Phy:Int=0
	def Physics_=(A:Int){			//Set
		if ((A>=0)&(A<=150)){
			Phy=A
		}
	}
	def Physics:Int={				//Get
		return Phy
	}
}

var Total:Int=0
var Student=new Results()
Student.Physics=69
Total=Student.Physics

print (Total)