public class HowManyWords {
	public static void main(String[] args) {
		String M="I am, I am going home, amen.";
		String S="amen";
		String P="";
		int B=S.length(),O=0;
		for(int A=0;A<=M.length()&&B!=M.length()+1;A++,B++){
			if(M.substring(A,B).equals(S)){
				if(A==0 || M.substring(A-1,A).equals(" ")){
					if((B+1)>M.length() || (M.substring(B, B+1).equals(" ") || (M.substring(B, B+1).equals(",") || M.substring(B, B+1).equals(".")))){
					O++;
					P=P+(A+1);
					P=P+",";
					}
				}
			}
		}
		System.out.println("Word Count:"+O);
		System.out.println("Position:"+P);
	}
}