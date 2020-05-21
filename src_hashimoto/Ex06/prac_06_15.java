import java.util.Scanner;
import java.util.Random;

public class prac_06_15 {
	public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        String[] weekEng = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        String[] weekJpn = {"月", "火", "水", "木", "金", "土", "日"};

        System.out.println("英語の曜日名を小文字で入力してください。");

        int n = rand.nextInt(7);

        while(true) {
            System.out.print(weekJpn[n] +"曜日：");
            String s = stdIn.nextLine();

            if (s.equals(weekEng[n])) {
                System.out.print("正解です。もう一度？　1...Yes／0...No：");
                int retry = stdIn.nextInt();
                if(retry != 1) break;

                int t = n;
                do {
                    n = rand.nextInt(7);
                } while (t == n);

                stdIn.nextLine(); //1行飛ばすだけ

            } else {
                System.out.println("違います。");
            }
        }
    }
}