public class Pattern {
	public static void main(String[] args) {
		int A,B;
		for(A=1;A<=10;A++)
			if(A%2==0) System.out.println(A);
			else {for(B=1;B<=A;B++) System.out.print(B);
			System.out.println();
			}
		}
}
