import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySort implements In{
	public static void main(String[] args) {
		ArraySort X=new ArraySort();
		int B=100;
		int[] Pie=X.Make(B);
		int[] Hi=X.Make2(B);
		int C=0;
		for(int A=0;A<Array.getLength(Pie);A++)if(Pie[A]<B)B=Pie[A];
		System.out.println(B);
		for(int A=0;A<Array.getLength(Hi);A++)if(Hi[A]>C)C=Hi[A];
		System.out.println(C);
		Arrays.sort(Pie);
		Arrays.sort(Hi);
		System.out.println(Arrays.toString(Pie));
		System.out.println(Arrays.toString(Hi));
	}
public int[] Make(int B){
	int[] Pie=new int[5];
	for(int A=0;A<Array.getLength(Pie);A++)Pie[A] = ((int)(Math.random()*B+1));
	return Pie;
	}
public int[] Make2(int B){
	int[] Hi=new int[5];
	for(int A=0;A<Array.getLength(Hi);A++)Hi[A] = ((int)(Math.random()*B+1));
	return Hi;
	}
}