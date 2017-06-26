//import java.util.Arrays;
public class Stack {
	public static void main(String[] args) {
		Stack Y=new Stack();
		int[] Stack1=new int[5];
		int[] ABC=new int[2];
		Stack1[0]=34;
		Stack1[1]=23;
		Stack1[2]=87;
		Stack1[3]=53;
		Stack1[4]=23;
		ABC[0]=5;
		ABC[1]=12;
		//System.out.println(Arrays.toString(Stack1));
		//System.out.println(Arrays.toString(ABC));
		Y.push(ABC,Stack1);
		//System.out.println(Arrays.toString(Stack1));
		//System.out.println(Arrays.toString(ABC));
		Y.pop(ABC,Stack1);
		//System.out.println(Arrays.toString(Stack1));
		//System.out.println(Arrays.toString(ABC));
		Y.peek(ABC, Stack1);
		//System.out.println(Arrays.toString(Stack1));
		//System.out.println(Arrays.toString(ABC));
		Y.clear(ABC,Stack1);
		//System.out.println(Arrays.toString(Stack1));
		//System.out.println(Arrays.toString(ABC));
	}
	public void push(int[] ABC, int[] Stack1){
		if(ABC[0]<5){
			Stack1[ABC[0]]=ABC[1];
			ABC[0]+=1;
		}
	}
	public void pop(int[] ABC, int[] Stack1){
		if(ABC[0]!=0){
			ABC[1]=Stack1[ABC[0]-1];
			ABC[0]-=1;
			Stack1[ABC[0]]=0;
			System.out.println(ABC[1]);
		}
	}
	public void peek(int[] ABC, int[] Stack1){
		ABC[1]=Stack1[ABC[0]-1];
		System.out.println(ABC[1]);
	}
	public void clear(int[] ABC, int[]Stack1){
		for(;ABC[0]>=0;ABC[0]--){
			Stack1[ABC[0]]=0;
		}
		ABC[0]=0;
	}
}