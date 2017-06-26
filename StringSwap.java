public class StringSwap {
	public static void main(String[] args) {
		String N="ABdif24*,219AbZ/?";
		String O="";
		for(int A=0;A<N.length();A++){
			 char[] Array = N.toCharArray();
			 char out, character=Array[A];
			 int B, ascii = (int) character;
			 if(ascii>=65 && ascii<=90) ascii+=32;
			 else if(ascii>=97 && ascii<=122) ascii-=32;
			 else if(ascii>=48 && ascii<=57){
				 ascii= Array[A];
				 ascii-=48;
				 ascii*=2;
				 if(ascii>9){
					 B=ascii/10;
					 ascii%=10;
					 B+=48;
					 out= (char) B;
					 O=O+out;
				 }
				 ascii+=48;
			 }
			 out= (char) ascii;
			 O=O+out;
		}
		System.out.println(O);
	}
}