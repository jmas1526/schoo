import java.util.Scanner;

class Q04_21_run {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("n�F");
			n = keyboardIn.nextInt();
		}while(n < 1);
		
		for(int i = 1; i <= n; i++){
			for(int j = n ; j > i; j--){
				System.out.print(' ');
			}
			for(int j = 0 ; j < i; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
