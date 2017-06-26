
public class Results {
	int p,c,m;
	float total,per;
	public void Calculations() {
		total=p+c+m;
		per=total*100/450;
	}
	public void ShowResults() {
		System.out.println("TotalScore="+total);
		System.out.println("Percentage="+per);
	}
}
