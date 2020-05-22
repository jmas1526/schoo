import java.util.Scanner;
import java.util.Random;

class Exercise7_19{
	
	
	static void aryRmvN(int []a,int idx,int n){
		for(int i=idx;i<a.length-n;i++){
			a[i]=a[i+n];
		}
		for(int i=0;i<a.length;i++){
			System.out.println("a["+i+"]="+a[i]);
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
		int n;
		do{
			System.out.println("”z—ña‚©‚ç—v‘fa[idx]‚ðæ“ª‚Æ‚·‚énŒÂ‚Ì—v‘f‚ðíœ‚µ‚Ü‚·B");
			System.out.print("idx=");
			idx=stdIn.nextInt();
			System.out.print("n=");
			n=stdIn.nextInt();
			
			
		}while(idx<0||N-1<idx||n<0||N<idx+n);
		
		aryRmvN(a,idx,n);
	}
	
}