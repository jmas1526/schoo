import java.util.Scanner;
import java.util.Random;

public class prac_2_8 {
	public static void main(String[] args) {
	
		Scanner stdln = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("xの値：");
		int x = stdln.nextInt();	

		int five_rand = x + rand.nextInt(11) - 5;

		System.out.println("その値の±5の乱数を生成しました。それは"+ five_rand +"です。");

	}
}