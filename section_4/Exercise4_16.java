import java.util.Scanner;

class Exercise4_16{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int n;
		
		do{
			System.out.print("‰½ŒÂ*‚ğ•\¦‚µ‚Ü‚·‚©F");
			n=stdIn.nextInt();
		}while (n<0);
		
		for(int i=1;i<=n;i++){
			System.out.print("*");
			if(i%5==0){
				System.out.println();
			}
		}
	}
}
