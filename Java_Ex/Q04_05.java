import java.util.Scanner;

class Q04_05 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		System.out.println("カウントダウンします。");
		int x;
		do {
			System.out.print("正の整数値：");
			x = keyboardIn.nextInt();
		}while(x <= 0);
		
		while(x >=0) {
			System.out.println(--x);
		}
	}
}
/*
演習4-5の解答
入力された値-1からカウントダウンが始まり、0を過ぎて-1までカウントされてしまう
*/
