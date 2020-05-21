import java.util.Scanner;

class Q2_5 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("xの値：");
		double x = keyboardIn.nextDouble();
		System.out.print("yの値：");
		double y = keyboardIn.nextDouble();
		System.out.println("合計は"+ (x + y) + "です。");
		System.out.println("平均は"+ (x + y) / 2 + "です。");
	}
}