import java.util.Scanner;
import java.util.Random;

class Exercise7_20{
	
	
	static void aryIns(int []a,int idx,int x){
		
		for(int i=a.length-2;i+1>idx;i--){
			a[i+1]=a[i];
		}
		a[idx]=x;
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[]args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("—v‘f”F");
		int N=stdIn.nextInt();
		
		int []a=new int[N];
		
		for(int i=0;i<N;i++){
			System.out.print("a["+i+"]=");
			a[i]=stdIn.nextInt();
		}
		
		int idx;
		int x;
		do{
			System.out.println("”z—ña‚Ì—v‘fa[idx]‚Éx‚ð‘}“ü‚µ‚Ü‚·B");
			System.out.print("idx=");
			idx=stdIn.nextInt();
			System.out.print("x=");
			x=stdIn.nextInt();
			
			
		}while(idx<0||N-1<idx);
		
		aryIns(a,idx,x);
	}
	
}