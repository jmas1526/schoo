import java.util.Scanner;

class Q04_06_1 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("‰½ŒÂ*‚ğ•\¦‚µ‚Ü‚·‚©F");
		int n = keyboardIn.nextInt();
		
		int i = 0;
		while(i < n) {
			System.out.print('*');
			i++;
		}
		if(n > 0){
			System.out.println();
		}
	}
}
