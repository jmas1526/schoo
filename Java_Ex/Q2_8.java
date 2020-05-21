import java.util.Scanner;
import java.util.Random;

class Q2_8 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("整数値：");
		int inNum = keyboardIn.nextInt();
		int randNum = rand.nextInt(11) - 5;
		System.out.println("その値の±5の乱数を生成しました。それは"
			+ (inNum + randNum) + "です。");
	}
}