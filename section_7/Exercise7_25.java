import java.util.Scanner;

public class Exercise7_25 {
	
	static int[] aryRmvOfN(int []a,int idx,int n) {
		
		int []b=new int [a.length-n];
		for(int i=0;i<=idx-1;i++) {
			b[i]=a[i];
		}
		for(int i=idx;i+n<a.length;i++) {
			b[i]=a[i+n];
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("配列aの要素数：");
		int N=stdIn.nextInt();
		
		int []a=new int[N];
		
		for(int i=0;i<N;i++) {
			System.out.print("a["+i+"]=");
			a[i]=stdIn.nextInt();
		}
		
		System.out.println("配列aから要素idxを先頭とするn個の要素を削除した配列を表示します。");
		System.out.print("idxの値は？：");
		int idx=stdIn.nextInt();
		System.out.print("nの値は？：");
		int n=stdIn.nextInt();
		
		int []b=aryRmvOfN(a,idx,n);
		
		for(int i=0;i<b.length;i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
		
	}

}
