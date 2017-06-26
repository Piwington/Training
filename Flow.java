
public class Flow {

	public static void main(String[] args) {
		int No;
		No=2000;
		if (No>4000) {
			System.out.println("A");
			No=No+100;
			if (No>5000) {
				System.out.println("B");
				System.out.println("C"); }
			else
				System.out.println("D");
			System.out.println("E");
			}
		else {
			No=No+1000;
			System.out.println("F");
			System.out.println("G");
			if (No<500)
				System.out.println("J");
			else {
				System.out.println("H");
				System.out.println("I");
			}
			System.out.println("K");
		}
		System.out.println("L");
	}
}