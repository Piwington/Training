public class Flow2 {
	public void calc(int A){
		for(;A<10;A++){
			System.out.println(A);
			if(A%2==0){
				System.out.println("Even");
				if(A>5) System.out.println("_");
					else System.out.println("*");
			}
			else{
				System.out.println("Odd");
				if(A>5) System.out.println("!");
					else System.out.println("?");
			}
		}
	}
}
