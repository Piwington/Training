public class Run2 {
	public static void main(String[] args) {
		//Flow2 X=new Flow2();
		Gar X=new Gar();
		Gar Y=new Gar();
		X.A=2;
		Y.A=4;
		X=Y;
		System.out.println(X.A);
		//X.calc(1);
	}
}
