import java.util.Scanner;

class Q3_12 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("整数A：");
		int a = keyboardIn.nextInt();
		System.out.print("整数B：");
		int b = keyboardIn.nextInt();
		System.out.print("整数C：");
		int c = keyboardIn.nextInt();
		
		int min = a;
		min = min < b ? min : b;
		min = min < c ? min : c;
		
		System.out.println("最小値：" + min);
	}
}