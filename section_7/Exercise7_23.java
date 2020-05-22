import java.util.Scanner;

public class Exercise7_23 {
	
	static int[] arySrchIdx(int []a,int x) {
		
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				count++;
			}
		}
		
		int []b=new int[count];
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				b[k]=i;
				k++;
			}
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
		
		System.out.println("配列aの中で値がxである全要素のインデックスを先頭から順に格納した配列を表示します。");
		System.out.print("xの値は？：");
		int x=stdIn.nextInt();
		int []b=arySrchIdx(a,x);
		
		for(int i=0;i<b.length;i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
		
	}

}
