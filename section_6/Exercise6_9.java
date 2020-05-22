import java.util.Scanner;
import java.util.Random;

class Exercise6_9{
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
		int n;
		
		
		do{
			System.out.print("—v‘f”F"); n=stdIn.nextInt();	
		}while(n<=0);
		
		int []a=new int[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=rand.nextInt(10)+1;
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}
