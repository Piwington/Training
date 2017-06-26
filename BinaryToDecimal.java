public class BinaryToDecimal {
	public static void main(String[] args) {
		int C=0;
		String in;
		in="10011001000011100";
		char[] Array = in.toCharArray();
		for(int B=1, A=in.length()-1;A>=0;A--){
			 char character=Array[A];
			 int ascii = (int) character;
			 if(ascii==49){
				C+=(B);
			}
			B=B*2;
		}
		System.out.println(C);
	}
}