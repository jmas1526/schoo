import java.util.Scanner;

class Q04_23 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("nÅF");
			n = keyboardIn.nextInt();
		}while(n < 1);
		
		for(int i = 1; i <= n; i++){
			for(int j = 1 ; j <= n - i; j++){
				System.out.print(' ');
			}
			for(int j = 1 ; j <= i * 2 - 1; j++){
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}
}
