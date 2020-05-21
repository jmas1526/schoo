import java.util.Scanner;

class Q3_13 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("整数A：");
		int a = keyboardIn.nextInt();
		System.out.print("整数B：");
		int b = keyboardIn.nextInt();
		System.out.print("整数C：");
		int c = keyboardIn.nextInt();
		
		if (a > b){
			int n = a;
			a = b;
			b = n;
		}
		if (a > c){
			int n = a;
			a = c;
			c = n;
		}if (b > c){
			int n = b;
			b = c;
			c = n;
		}
		System.out.println("中央値：" + b);
	}
}