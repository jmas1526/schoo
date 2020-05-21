import java.util.Scanner;

class Q04_16 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("‰½ŒÂ*‚ğ•\¦‚µ‚Ü‚·‚©F");
			n = keyboardIn.nextInt();
		}while(n < 1);
		
		for(int i = 0; i < n; i++) {
			System.out.print('*');
			if((i+1) % 5 == 0) System.out.println();
		}
	}
}
