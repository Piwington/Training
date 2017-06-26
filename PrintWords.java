public class PrintWords {
	public static void main(String[] args) {
		String N="I am going to London";
		int C=N.length(),D;
		for(int A=N.length();A>0;A--){
			if(N.substring(A-1, A).equals(" ")){
				D=A;
				System.out.println(N.substring(D,C));
				C=D;
			}
		}
		D=0;
		System.out.println(N.substring(D,C));
	}
}