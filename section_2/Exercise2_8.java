import java.util.Random;
import java.util.Scanner;

class Exercise2_8{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("整数値：");
		int x = stdIn.nextInt();
		
		int a = rand.nextInt(11);
		int b = a-5;
		
		System.out.print("その値の±5の乱数を生成しました。\nその値は"+(x-b)+"です。");
	}
}
