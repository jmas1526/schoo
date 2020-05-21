import java.util.Scanner;

class Q04_07 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("âΩå¬ï\é¶ÇµÇ‹Ç∑Ç©ÅF");
		int n = keyboardIn.nextInt();
		
		int i = 0;
		while(i < n / 2) {
			System.out.print('*');
			System.out.print('+');
			i++;
		}
		if(n % 2 == 1){
			System.out.print('*');
		}
		if(n > 0){
			System.out.println();
		}
	}
}
