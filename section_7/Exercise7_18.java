import java.util.Scanner;
import java.util.Random;

class Exercise7_18{
	
	
	static void aryRmv(int []a,int idx){
		for(int i=idx;i<a.length-1;i++){
			a[i]=a[i+1];
		}
		for(int i=0;i<a.length;i++){
			System.out.println("a["+i+"]="+a[i]);
		}
	}
	
	public static void main(String[]args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("要素数：");
		int n=stdIn.nextInt();
		
		int []a=new int[n];
		
		for(int i=0;i<n;i++){
			System.out.print("a["+i+"]=");
			a[i]=stdIn.nextInt();
		}
		
		int idx;
		do{
			System.out.println("配列aから要素a[idx]を削除します。");
			System.out.print("idx=");
			idx=stdIn.nextInt();
		}while(idx<0||n-1<idx);
		
		aryRmv(a,idx);
	}
	
}