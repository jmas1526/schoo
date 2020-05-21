import java.util.Scanner;

class Q2_6 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		System.out.print("三角形の面積を求めます。\n");
		System.out.print("底辺：");
		double x = keyboardIn.nextDouble();
		System.out.print("高さ：");
		double y = keyboardIn.nextDouble();
		System.out.println("面積は"+ (x * y / 2) + "です。");
	}
}