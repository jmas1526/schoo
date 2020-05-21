import java.util.Scanner;

class Q04_25_1 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか：");
		int n = keyboardIn.nextInt();
		
		int sum = 0;
		int ave = 0;
		for(int i = 1; i <= n; i++) {
			System.out.print("整数(0で終了)：");
			int t = keyboardIn.nextInt();
			if (t == 0) break;
			sum += t;
			ave = sum / i;
		}
		System.out.println("合計は" + sum + "、平均は" + ave + "です。");
	}
}
