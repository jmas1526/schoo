import java.util.Scanner;

class Exercise4_9{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int n;
		do{
			System.out.print("³‚Ì®”’lF");
			n=stdIn.nextInt();
		}while (n<=0);
		int nFirst=n;
		int product=1;
		
		while (n>0){
			product*=n;
			n--;
		}
		System.out.println("1‚©‚ç"+nFirst+"‚Ü‚Å‚ÌÏ‚Í"+product+"‚Å‚·B");
	}
}

			