import java.util.Scanner;

class Q04_21_lup {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("nÅF");
			n = keyboardIn.nextInt();
		}while(n < 1);
		
		for(int i = 0; i < n; i++){
			for(int j = n ; j > i; j--){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
