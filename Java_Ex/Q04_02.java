import java.util.Scanner;
import java.util.Random;

class Q04_02 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		Random rand = new Random();
		
		int x = rand.nextInt(90) + 10;
		int n;
		do{
			do{
				System.out.print("2桁の整数はいくつかな：");
				n = keyboardIn.nextInt();
			}while(n < 10 || n > 99);
			
			if(n > x)
				System.out.println("もっと小さいよ");
			else if(n < x)
				System.out.println("もっと大きいよ");
		}while(n != x);
		System.out.print("正解！！");
	}
}