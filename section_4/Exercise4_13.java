import java.util.Scanner;

class Exercise4_13{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int n;
		
		do{
			System.out.println("1‚©‚çn‚Ü‚Å‚Ì˜a‚ğ‹‚ß‚Ü‚·B");
			n=stdIn.nextInt();
		}while (n<=0);
		int sum =0;
		
		for (int i=0;i<=n;i++){
			sum+=i;
		}
		System.out.println("1‚©‚ç"+n+"‚Ü‚Å‚Ì˜a‚Í"+sum+"‚Å‚·B");
	}
}
