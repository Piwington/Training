public class DivisionException {
	public static void main(String[] args) {
		int A,B;
		OwnEx X=new OwnEx();
		try{
			A=Integer.parseInt(args[0]);
			B=Integer.parseInt(args[1]);
			X.Check(A,B);
		}
		catch(ArithmeticException Y){
			System.out.println("Can't Divide By Zero");
		}
		catch(ArrayIndexOutOfBoundsException Y){
			System.out.println("Requires Two Integer Values");
		}
		catch(NumberFormatException Y){
			System.out.println("Only Integer Values Excepted");
		}
		catch(OwnEx Y){
			System.out.println("A Must Be Greater Than B");
	}
}
}
class OwnEx extends Exception{
	public void Check(int A, int B) throws OwnEx{
		if(A<B){
			OwnEx X=new OwnEx();
			throw X;
		}
		else{
			int C=A/B;
			System.out.println("Result:"+C);
		}
	}
}