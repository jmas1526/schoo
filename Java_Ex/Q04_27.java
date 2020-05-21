import java.util.Scanner;
import java.util.Random;

class Q04_27 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		Random rand = new Random();
		
		int no = rand.nextInt(100);
		
		System.out.println("数当てゲーム開始!!");
		System.out.println("0～99の数を当ててください。");
		
		int max;
		do {
			System.out.print("制限回数：");
			max = keyboardIn.nextInt();
		}while(max < 1);
		
		int count = 0;
		int x;
		do {
			System.out.print("いくつかな：");
			x = keyboardIn.nextInt();
			count++;
			if(count > max) break;
			
			if(x > no)
				System.out.println("もっと小さな数だよ。");
			else if(x < no)
				System.out.println("もっと大きな数だよ。");
		}while (x != no);
		
		if (x == no)
			System.out.println("正解です。");
		else
			System.out.println("時間切れです。正解は" + no + "です。");
	}
}
