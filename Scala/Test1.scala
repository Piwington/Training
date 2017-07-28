def ItoS(x:Int):String= x match{
	case 0 => "Zero"
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

val Input=7
var Output=ItoS(Input)
print (Input+" = "+Ouput)