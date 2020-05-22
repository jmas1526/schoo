import java.util.Scanner;

class Exercise4_14{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		
		
		int n;
		do{
			System.out.println("1‚©‚çn‚Ü‚Å‚Ì˜a‚ğ‹‚ß‚Ü‚·B");
			n=stdIn.nextInt();
		}while (n<=0);
		
		int sum =0;
		
		for (int i=1;i<=n;i++){
			sum+=i;
			System.out.print(i+" ");
			
			if (i<n){
				System.out.print("+ ");
			}
		}
		System.out.println("= "+sum);
	}
}
