public class Mapping {
	String[][] multi;
	public static void main(String[] args) {
		Mapping X=new Mapping();
		String[][] multi;
		String Key="Gender";
		String Key2="Pie";
		String Value="Male";
		String Value2="Female";
		multi=X.Make();
		boolean B;
		X.add(multi,Key,Value);
		X.remove(multi, Key2);
		B=X.findKey(multi, Key);
		System.out.println(B);
		X.mapKey(multi, Key, Value2);
		B=X.containsValue(multi, Value2);
		System.out.println(B);
	}
	public String[][] Make(){
		String[][] multi = new String[3][5];
		multi[0][0]="Pie";
		multi[0][1]="Cherry";
		multi[0][2]="Steak";
		multi[0][3]="Chicken";
		multi[0][4]="Apple";
		return multi;
	}
	public void add(String[][] multi, String Key,String Value){
		String[][] C=new String[1][1];
		int B=0;
		for(int A=0;A<3&&B==0;A++){
			if(multi[A][0]==C[0][0]){
				multi[A][0]=Key;
				multi[A][1]=Value;
				B=1;
			}
		}
	}
	public void remove(String[][] multi,String Key){
		for(int A=0;A<3;A++){
			if(multi[A][0]==Key){
				String[][] C=new String[1][1];
				for(int B=0;B<5;B++){
					multi[A][B]=C[0][0];
				}
			}
		}
	}
	public boolean findKey(String[][] multi, String Key){
		boolean B=false;
		for(int A=0;A<3;A++){
			if(multi[A][0]==Key)B=true;
		}
		return B;
	}
	public void mapKey(String[][] multi,String Key,String Value){
		String[][] C=new String[1][1];
		int D=0;
		for(int A=0;A<3;A++){
			if(multi[A][0]==Key){
				for(int B=0;B<5&&D==0;B++){
					if(multi[A][B]==C[0][0]){
						multi[A][B]=Value;
						D=1;
					}
				}
			}
		}
	}
	public boolean containsValue(String[][] multi,String Value){
		boolean B=false;
		for(int A=0;A<3;A++){
			for(int C=0;C<5;C++){
				if(multi[A][C]==Value)B=true;
			}
		}
		return B;
	}
}