import java.util.Scanner;
import java.util.Random;

class Exercise6_11{
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
		int n;
		
		
		do{
			System.out.print("óvëfêîÅF"); n=stdIn.nextInt();	
		}while(n<=0 ||n>10);
		
		System.out.println();
		
		int []a=new int[n];
		
		for(int i=0;i<n;i++){
			if(i==0){
				
				int random=rand.nextInt(10)+1;
				a[i]=random;
				
			}else if(i>0){
				
			roop:
				while (true){
					int random=rand.nextInt(10)+1;
					
					for(int j=0;j<i;j++){
						
						if(random==a[j]){
							continue roop;
						}
					}
					
					a[i]=random;
					break;
				}
			}
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}

