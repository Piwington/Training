
public class StaticM {

	public static void main(String[] args) {
		StaticT One, Two;
		One=new StaticT();
		Two=new StaticT();
		StaticT.Set(35);
		One.Doll(5);
		Two.Doll(8);
	}

}
