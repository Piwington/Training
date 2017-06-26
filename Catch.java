public class Catch {
	public static void main(String[] args) {
	int C;
		try{
		C=4/0;
		System.out.println(C);
		}
	catch(ArithmeticException A){
		System.out.println("Can't Divide By Zero");
		}
	}
}