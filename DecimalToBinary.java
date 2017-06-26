public class DecimalToBinary {
	public static void main(String[] args) {
		int in,up,A,B,C;
		String num;
		num="";
		in=78364;
		for(B=in,A=-1;B!=0;A++){
			B/=2;
		}
		for(;A>=0;A--){
			for(C=A,up=1;C>0;C--){
				up*=2;
			}//Math.pow(2,A)
			if((in-up)>=0){
				in-=up;
				num=num+"1";
			}
			else num=num+"0";
		}
		System.out.println(num);
	}
}