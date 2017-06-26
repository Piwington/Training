public class ArrayArray {
	public static void main(String[] args) {
		PI record[]=new PI[5];
		record[0]=new PI();
		record[0].A=6;
		record[0].B="Dance";
		record[0].X[0]=new Address();
		record[0].X[0].C=8.651273e3f;
		System.out.println("A "+record[0].A+" B "+record[0].B+" C "+record[0].X[0].C);
	}
}
class PI{
	int A=0;
	String B;
	Address X[]=new Address[2];
}
class Address{
	float C=0;
}