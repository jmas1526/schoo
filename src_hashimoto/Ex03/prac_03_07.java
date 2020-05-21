import java.util.Scanner;

public class prac_03_07 {
	public static void main(String[] args) {
	
		Scanner stdln = new Scanner(System.in);

		System.out.print("正の整数値：");
        int x = stdln.nextInt();
        
        if (x > 0) {
            if (x % 3 == 0) {
                System.out.println("その値は3で割り切れます。");
            } else {
                System.out.println("その値を3で割った余りは"+ x%3 +"です。");
            }
        } else {
            System.out.println("正でない値が入力されました。");
        }

	}
}