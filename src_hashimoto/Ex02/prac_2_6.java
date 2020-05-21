import java.util.Scanner;

public class prac_2_6 {
	public static void main(String[] args) {

		System.out.println("三角形の面積を求めます。");
	
		Scanner stdln = new Scanner(System.in);

		System.out.print("底辺：");
		double x = stdln.nextDouble();
		System.out.print("高さ：");
		double y = stdln.nextDouble();

		System.out.println("面積は"+ (x*y)/2 +"です。");

	}
}