import java.util.Scanner;

class Q04_12 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		int n;
		do{
			
			System.out.print("正の整数値：");
			n = keyboardIn.nextInt();
		}while(n <= 0);
		for(int i = 0; i <= n; i++) {
			System.out.println(i);
		}
	}
}
