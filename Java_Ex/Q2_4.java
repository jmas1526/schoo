import java.util.Scanner;

class Q2_4 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int in = keyboardIn.nextInt();
		System.out.println("10を加えた値は"+ (in + 10) + "です");
		System.out.println("10を減じた値は"+ (in - 10) + "です");
	}
}