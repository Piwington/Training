public class Replace {
	public static void main(String[] args) {
		String M="I am, I am going home, amen.";
		String S="am";
		String R="";
		String P="";
		int L=M.length();
		int B=S.length(),O=0;
		for(int A=0;A<=L&&B!=L+1;A++,B++){
			if(M.substring(A,B).equals(S)){
				if(A==0 || M.substring(A-1,A).equals(" ")){
					if((B+1)>M.length() || (M.substring(B, B+1).equals(" ") || (M.substring(B, B+1).equals(",") || M.substring(B, B+1).equals(".")))){
					O++;
					P=P+(A+1);
					P=P+",";
					if(R!=""){
						M=M.substring(0,A)+R+M.substring(B,M.length());
						L=M.length();
					}
					}
				}
			}
		}
		System.out.println("Word Count:"+O);
		if(R=="") System.out.println("Position:"+P);
		else System.out.println("New Sentence:"+M);
	}
}