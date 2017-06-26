
public class Extraction {
	
	public static void main(String[] args) {
		int Num=874,No=0;
		while(Num>0){
			No+=(Num%10);
			Num/=10;
		}
		System.out.println(No);

	}

}
