import java.util.Scanner;

public class Exercise7_21 {
	
	static void aryExchng(int []a,int []b) {
		if(a.length>b.length) {
			for(int i=0;i<b.length;i++) {
				int t=a[i];
				a[i]=b[i];
				b[i]=t;
			}
		}else if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				int t=a[i];
				a[i]=b[i];
				b[i]=t;
			}
		}else {
			for(int i=0;i<a.length;i++) {
				int t=a[i];
				a[i]=b[i];
				b[i]=t;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
		for(int i=0;i<b.length;i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
	}
		

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("配列aの要素数：");
		int n=stdIn.nextInt();
		System.out.print("配列bの要素数：");
		int m=stdIn.nextInt();
		
		int []a=new int[n];
		int []b=new int[m];
		
		for(int i=0;i<n;i++) {
			System.out.print("a["+i+"]=");
			a[i]=stdIn.nextInt();
		}
		
		for(int i=0;i<m;i++) {
			System.out.print("b["+i+"]=");
			b[i]=stdIn.nextInt();
		}
		
		System.out.println("全要素の値を入れ替えます。");
		aryExchng(a,b);
	}

}
