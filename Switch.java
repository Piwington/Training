
public class Switch {

	public static void main(String[] args) {
		int SS=4;
		String Sss;
		switch (SS) {
		case 1: case 2: case 3: Sss="Sad";
		break;
		case 4: case 5: case 6: Sss="Neutral";
		break;
		case 7: case 8: case 9: Sss="Happy";
		break;
		case 10: Sss="Estatic";
		break;
		default: Sss="I Have No Emotions";
		break;
		}
		System.out.println(Sss);
	}

}
