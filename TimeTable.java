public class TimeTable {
	public void calc(int T, int R){
		int C=1,A;
		System.out.println("Times Table Of "+T);
		for(;C<=R;C++){
			A=T*C;
			System.out.println(T+"x"+C+"="+A);
		}
	}
}