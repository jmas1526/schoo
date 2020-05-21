import java.util.Scanner;

class Q04_01 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		int retry;
		do{
			System.out.print("整数値：");
			int n = keyboardIn.nextInt();
			
			if(n > 0)
				System.out.println("その値は正です。");
			else if(n < 0)
				System.out.println("その値は負です。");
			else
				System.out.println("その値は0です。");
			do{
				System.out.print("Continue? Yes...1 / No...0：");
				retry = keyboardIn.nextInt();
			}while (retry != 0 && retry != 1);
		}while(retry == 1);
	}
}