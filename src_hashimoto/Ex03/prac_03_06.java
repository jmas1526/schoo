import java.util.Scanner;

public class prac_03_06 {
	public static void main(String[] args) {
	
		Scanner stdln = new Scanner(System.in);

		System.out.print("正の整数値：");
        int x = stdln.nextInt();
        
        if (x > 0) {
            if (x % 10 == 0) {
                System.out.println("その値は10の倍数です。");
            } else {
                System.out.println("その値は10の倍数ではありません。");
            }
        } else {
            System.out.println("正でない値が入力されました。");
        }

	}
}