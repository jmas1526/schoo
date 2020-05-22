import java.util.Scanner;
import java.util.Random;

class Exercise6_12{
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
		int n;
		
		System.out.print("要素数："); n=stdIn.nextInt();
		
		System.out.println();
		
		int []a=new int[n];
		int []save=new int[n];
		for(int i=0;i<n;i++){
			
			int random=rand.nextInt(10)+1;
			a[i]=random;
			System.out.println("a["+i+"]="+a[i]);
			
		}
		System.out.println();
		System.out.println("配列の要素をシャッフルします。");
		System.out.println();
		
		for(int i=0;i<n;i++){
			save[i]=-1;
		}
		for(int i=0;i<n;i++){
			
		roop:	
			while(true){
				
				int m=rand.nextInt(n);
				
				for(int j=0;j<n;j++){
					if(save[j]==m){
						continue roop;
					}
				}
				save[i]=m;
				break;
			}
			System.out.println("a["+save[i]+"]="+a[save[i]]);
		}
	}
}

