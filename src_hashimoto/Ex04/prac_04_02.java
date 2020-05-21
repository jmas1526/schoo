import java.util.Scanner;
import java.util.Random;

public class prac_04_02 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);
        Random rand = new Random();

        int no = rand.nextInt(90) + 10;


        System.out.println("数当てゲーム開始");
        System.out.println("10~99の2桁の数を当ててください");

        int x;

        do {

            System.out.print("いくつかな：");
            x = stdln.nextInt();

            if (x > no) {
                System.out.println("もっと小さい数です");
            } else if (x < no) {
                System.out.println("もっと大きい数です");
            }

        } while (x != no);

        System.out.println("正解です");

    }
}