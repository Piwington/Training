public class NumberToWord {
	public static void main(String[] arg){
		int A,B,C,D,Num=123;
		A=Num%10;
		B=(Num/10)%10;
		C=(Num/100)%10;
		D=(Num/1000)%10;
		if(Num>999){
		switch (D){
		case 1: System.out.print("One Thousand");
		break;
		case 2: System.out.print("Two Thousand");
		break;
		case 3: System.out.print("Three Thousand");
		break;
		case 4: System.out.print("Four Thousand");
		break;
		case 5: System.out.print("Five Thousand");
		break;
		case 6: System.out.print("Six Thousand");
		break;
		case 7: System.out.print("Seven Thousand");
		break;
		case 8: System.out.print("Eight Thousand");
		break;
		case 9: System.out.print("Nine Thousand");
		break;
		}}
		if(Num>99){
		switch (C){
		case 1: System.out.print(" One Hundred");
		break;
		case 2: System.out.print(" Two Hundred");
		break;
		case 3: System.out.print(" Three Hundred");
		break;
		case 4: System.out.print(" Four Hundred");
		break;
		case 5: System.out.print(" Five Hundred");
		break;
		case 6: System.out.print(" Six Hundred");
		break;
		case 7: System.out.print(" Seven Hundred");
		break;
		case 8: System.out.print(" Eight Hundred");
		break;
		case 9: System.out.print(" Nine Hundred");
		break;
		}
		if ((A!=0 || B!=0) && C!=0) System.out.print(" And");
		}
		if(Num>9){
		switch (B){
		case 1: switch (A){
		case 1: System.out.print(" Eleven");
		break;
		case 2: System.out.print(" Twelve");
		break;
		case 3: System.out.print(" Thirteen");
		break;
		case 4: System.out.print(" Fourteen");
		break;
		case 5: System.out.print(" Fifteen");
		break;
		case 6: System.out.print(" Sixteen");
		break;
		case 7: System.out.print(" Seventeen");
		break;
		case 8: System.out.print(" Eightteen");
		break;
		case 9: System.out.print(" Nineteen");
		break;
		default: System.out.print(" Ten");
		break;
		}
		break;
		case 2: System.out.print(" Twenty");
		break;
		case 3: System.out.print(" Thirty");
		break;
		case 4: System.out.print(" Fourty");
		break;
		case 5: System.out.print(" Fifty");
		break;
		case 6: System.out.print(" Sixty");
		break;
		case 7: System.out.print(" Seventy");
		break;
		case 8: System.out.print(" Eighty");
		break;
		case 9: System.out.print(" Ninety");
		break;
		}}
		if (B!=1){
			switch (A){
			case 1: System.out.print(" One");
			break;
			case 2: System.out.print(" Two");
			break;
			case 3: System.out.print(" Three");
			break;
			case 4: System.out.print(" Four");
			break;
			case 5: System.out.print(" Five");
			break;
			case 6: System.out.print(" Six");
			break;
			case 7: System.out.print(" Seven");
			break;
			case 8: System.out.print(" Eight");
			break;
			case 9: System.out.print(" Nine");
			break;
			}
		}
	}
}