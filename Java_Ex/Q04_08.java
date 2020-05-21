import java.util.Scanner;

class Q04_08 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		int n;
		do{
			
			System.out.print("整数値：");
			n = keyboardIn.nextInt();
		}while(n <= 0);
		
		int i = 0;
		while(n > 0) {
			i++;
			n /= 10;
		}
		
		System.out.println("その値は"+ i + "桁です。");
	}
}
