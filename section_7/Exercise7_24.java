import java.util.Scanner;

public class Exercise7_24 {
	
	static int[] aryRmvOf(int []a,int idx) {
		
		int []b=new int [a.length-1];
		for(int i=0;i<=idx-1;i++) {
			b[i]=a[i];
		}
		for(int i=idx;i<a.length-1;i++) {
			b[i]=a[i+1];
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("配列aの要素数：");
		int n=stdIn.nextInt();
		
		int []a=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("a["+i+"]=");
			a[i]=stdIn.nextInt();
		}
		
		System.out.println("配列aから要素idxを削除した配列を表示します。");
		System.out.print("idxの値は？：");
		int idx=stdIn.nextInt();
		int []b=aryRmvOf(a,idx);
		
		for(int i=0;i<b.length;i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
		
	}

}
