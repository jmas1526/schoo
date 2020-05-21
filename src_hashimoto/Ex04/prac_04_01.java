import java.util.Scanner;

public class prac_04_01 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);
        int retry;

        do {

            System.out.print("整数値：");
            int n = stdln.nextInt();

            if(n == 0){
                System.out.println("その値は0です。");
            } else if (n > 0) {
                System.out.println("その値は正です。");
            } else {
                System.out.println("その値は負です。");
            }

            System.out.println("続けますか？ Yes...1 / No...0");

            retry = stdln.nextInt();

        } while (retry == 1);

    }
}