import java.util.Scanner;

class Exercise4_17{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int n;
		int m=0;
		
		do{
			System.out.print("®”’lF");
			n=stdIn.nextInt();
		}while (n<=0);
		
		for(int i=1;i<=n;i++){
			if(n%i==0){
				System.out.println(i);
				m++;
			}
		}
		System.out.println("–ñ”‚Í"+m+"ŒÂ‚Å‚·B");
	}
}
