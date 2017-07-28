var String:String=""
def ItoSS(x:Int,a:String):String={
	var s=x match{
	case 1 => "One"
	case 2 => "Two"
	case 3 => "Three"
	case 4 => "Four"
	case 5 => "Five"
	case 6 => "Six"
	case 7 => "Seven"
	case 8 => "Eight"
	case 9 => "Nine"
	}
	var b=s+" "+a
	return b
}
def ItoSD(x:Int,a:String):String={
	var s=x match{
	case 2 => "Twenty"
	case 3 => "Thirty"
	case 4 => "Fourty"
	case 5 => "Fifty"
	case 6 => "Sixty"
	case 7 => "Seventy"
	case 8 => "Eighty"
	case 9 => "Ninety"
	}
	var b=s+" "+a
	return b
}
def ItoST(x:Int,a:String):String={
	var s=x match{
	case 0 => "Ten"
	case 1 => "Eleven"
	case 2 => "Twelve"
	case 3 => "Thirteen"
	case 4 => "Fourteen"
	case 5 => "Fifteen"
	case 6 => "Sixteen"
	case 7 => "Seventeen"
	case 8 => "Eighteen"
	case 9 => "Nineteen"
	}
	var b=s+" "+a
	return b
}


var Input= -7534713

def Triple(x:Int,a:String):String={
	var s=x match{
	case 1 => "Thousand"
	case 2 => "Million"
	case 3 => "Billion"
	}
	var b=s+" "+a
	return b
}

print(" ")
var D=0
var E=0
var Neg=0
if (Input<0){
	Neg=1
	Input=0-Input
}
if (Input==0){
	print("Zero")
}
while ((Input!=0)|(D!=0)){
	D=Input/1000
	var A=Input%10
	Input=Input/10
	var B=Input%10
	Input=Input/10
	var C=Input%10
	Input=Input/10
	if ((E!=0)&(((A!=0)|(B!=0))|(C!=0))){
		String=Triple(E,String)
	}
	E+=1
	if ((B!=1)&(A!=0)){
		String=ItoSS(A,String)
	}
	if (B==1){
		String=ItoST(A,String)
	}
	else if (B!=0){
		String=ItoSD(B,String)
	}
	if (((B!=0)|(A!=0))&((D!=0)|(C!=0))){
			String="And "+String
	}
	if (C!=0){
		String="Hundred "+String
		String=ItoSS(C,String)
	}
}
if (Neg==1){
	String="Negative "+String
}
print (String)