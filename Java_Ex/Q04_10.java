import java.util.Scanner;

class Q04_10 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("‰½ŒÂ*‚ğ•\¦‚µ‚Ü‚·‚©F");
		int n = keyboardIn.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print('*');
		}
		if(n > 0) System.out.println();
	}
}
