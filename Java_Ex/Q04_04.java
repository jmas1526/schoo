import java.util.Scanner;

class Q04_04 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		System.out.println("カウントダウンします。");
		int x;
		do {
			System.out.print("正の整数値：");
			x = keyboardIn.nextInt();
		}while(x <= 0);
		
		while(x >=0) {
			System.out.println(x);
			x--;
		}
		System.out.println("終了時：" + x);
	}
}