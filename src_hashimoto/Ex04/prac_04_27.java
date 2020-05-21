import java.util.Scanner;
import java.util.Random;

public class prac_04_27 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);
        Random rand = new Random();

        int no = rand.nextInt(100);

        int chance = rand.nextInt(8)+3;

        System.out.println("数当てゲーム開始");
        System.out.println("0~99の数を当ててください");
        System.out.println("解答できるのは"+ chance + "回までです");

        int i=1;;

        while (i <= chance) {
            System.out.print("いくつかな：");
            int x = stdln.nextInt();
            if(x == no) {
                System.out.println(x +"は正解です");
                break;
            } else if (i >= chance) {
                System.out.println("残念でした");
                System.out.println("正解は"+ no + "でした");
                break;
            } else if (x > no) {
                System.out.println("もっと小さい数です");
            } else if (x < no) {
                System.out.println("もっと大きい数です");
            }
            System.out.println("あと"+ (chance - i) +"回");
            i++;
        }
    }
}