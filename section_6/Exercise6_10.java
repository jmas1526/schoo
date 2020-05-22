import java.util.Scanner;
import java.util.Random;

class Exercise6_10{
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
		int n;
		
		
		do{
			System.out.print("—v‘f”F"); n=stdIn.nextInt();	
		}while(n<=0);
		
		int []a=new int[n];
		
		for(int i=0;i<n;i++){
			if(i==0){
				a[i]=rand.nextInt(10)+1;
			}else{
				do{
					a[i]=rand.nextInt(10)+1;
				}while(a[i]==a[i-1]);
			}
			
			System.out.println("a["+i+"]="+a[i]);
			
		}
	}
}
