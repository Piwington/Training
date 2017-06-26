public class ThreeNum {
	public static void main(String[] args) {
		int[] Row={79,23,79,1,79,10,42};
		int A=0,B=0,C=0;
		for(int z=0;z<Row.length;z++){
			if(Row[z]>A)A=Row[z];
		}
		for(int z=0;z<Row.length;z++){
			if(Row[z]<A&&Row[z]>B)B=Row[z];
		}
		for(int z=0;z<Row.length;z++){
			if(Row[z]<B&&Row[z]>C)C=Row[z];
		}
		System.out.println("1st:"+A);
		System.out.println("2nd:"+B);
		System.out.println("3rd:"+C);
	}
}