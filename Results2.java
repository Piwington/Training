
public class Results2 {
	private int p,c,m,total,check,fail;
	private float per;
	public void ShowResults() {
		if(check==3){
			total=p+c+m;
			per=(float)total*100/450;
			System.out.println("TotalScore="+total);
			System.out.println("Percentage="+per);
		}
		else
			if(fail==1)
				System.out.println("Retake Exam");
			else
				if(fail==2)
					System.out.println("Retake Course");
				else
					if(fail==3)
						System.out.println("Go Home");
	}
	public void Physics (int A){
		if (A>=0 && A<=150){
			if (A>=70){
				p=A;
				check=check+1;
			}
			else
				fail=fail+1;
		}
		else{
			System.out.println("Invalid Physics Result");
			fail=0;
		}
	}
	public void Chemistry (int B){
		if (B>=0 && B<=150){
			if (B>=70){
				c=B;
				check=check+1;
			}
			else
				fail=fail+1;
}
		else{
			System.out.println("Invalid Chemistry Result");
			fail=0;
		}
	}
	public void Maths (int C){
		if (C>=0 && C<=150){
			if (C>=70){
				m=C;
				check=check+1;
			}
			else
				fail=fail+1;
}
		else{
			System.out.println("Invalid Maths Result");
			fail=0;
		}
	}
}
