import java.util.Scanner;

public class prac_2_4 {
	public static void main(String[] args) {
	
		Scanner stdln = new Scanner(System.in);

		System.out.print("整数値：");
		int x = stdln.nextInt();

		System.out.println("10を加えた値は"+ (x+10) +"です。");
		System.out.println("10を減じた値は"+ (x-10) +"です。");

	}
}