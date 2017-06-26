public class FacCall {
	static FacCall X;
	static int A;
	private FacCall(){}
	public static FacCall Limit(){
		if(A<3){
			X=new FacCall();
			A++;
		}
		else {
			System.out.println("Limit Reached, Address Already In Use");
			X=null;
		}
			return X;
	}
}