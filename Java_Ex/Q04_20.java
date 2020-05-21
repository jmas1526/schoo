import java.util.Scanner;

class Q04_20 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("nÅF");
			n = keyboardIn.nextInt();
		}while(n < 1);
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
