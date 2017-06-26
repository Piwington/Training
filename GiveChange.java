public class GiveChange {
	public static void main(String[] args) {
		double Bill,Paid,Change,A;
		Bill=75.37;
		Paid=100;
		Change=Paid-Bill;
		A=50;
		Paid=0;
		Bill=0;
		while(A>=0.01){
			while(Change-A>=0){
				Change-=A;
				Paid++;
			}
			if (Paid>0){
				if(A==50)System.out.println("£50="+Paid);
				if(A==5)System.out.println("£5="+Paid);
				if(A==0.50)System.out.println("£0.5="+Paid);
				if(A==0.05)System.out.println("£0.05="+Paid);
				if(A==20) System.out.println("£20="+Paid);
				if(A==2) System.out.println("£2="+Paid);
				if(A==0.20) System.out.println("£0.20="+Paid);
				if(A==0.02) System.out.println("£0.02="+Paid);
				if(A==10) System.out.println("£10="+Paid);
				if(A==1) System.out.println("£1="+Paid);
				if(A==0.10) System.out.println("£0.10="+Paid);
			}
			if(Change>0.01 && Change<0.02) System.out.println("£0.01=2.0");
			if(Change>0 && Change<=0.01) System.out.println("£0.01=1.0");
			Paid=0;
			Bill++;
			if(Bill==1) A=20;
			if(Bill==2) A=10;
			if(Bill==3) A=5;
			if(Bill==4) A=2;
			if(Bill==5) A=1;
			if(Bill==6) A=0.50;
			if(Bill==7) A=0.20;
			if(Bill==8) A=0.10;
			if(Bill==9) A=0.05;
			if(Bill==10) A=0.02;
			if(Bill==11) A=0.01;
			if(Bill==12) A=0;
		}
	}
}
