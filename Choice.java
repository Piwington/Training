public class Choice {
	public static void main(String[] args) {
		int A=6;
		Choice V=new Choice();
		if(A>5){
			Fir C=new Fir();
			V.Do(C);
		}
		else {
			Sec C=new Sec();
			V.Do(C);
		}	
	}
	public void Do(Diver X){
		X.Draw();
	}
}