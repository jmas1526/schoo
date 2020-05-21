import java.util.Scanner;

public class prac_2_5 {
	public static void main(String[] args) {
	
		Scanner stdln = new Scanner(System.in);

		System.out.print("xの値：");
		double x = stdln.nextDouble();
		System.out.print("yの値：");
		double y = stdln.nextDouble();

		System.out.println("合計は"+ (x+y) +"です。");
		System.out.println("平均は"+ (x+y)/2 +"です。");

	}
}