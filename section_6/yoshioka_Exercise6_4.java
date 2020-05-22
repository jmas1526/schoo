import java.util.Scanner;
import java.util.Random;

class Exercise6_4{
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
		final int Max=10;
		
		System.out.print("—v‘f”F");
		int n=stdIn.nextInt();
		
		int []a=new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=rand.nextInt(Max)+1;
		}
		//make column
		for(int i=0;i<Max;i++){
			
			//make row
			for(int j=0;j<n;j++){
				
				if(a[j]>=Max-i){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
		
		//make line
		for(int i=0;i<n;i++){
			if(i==n-1){
				
				System.out.print("-");
				
			}else{
				
				System.out.print("--");
				
			}
		}
		
		System.out.println();
		
		//make index
		for(int i=0;i<n;i++){
			
			System.out.print(i%10+" ");
			
		}
		
		System.out.println();
		
	}
}
