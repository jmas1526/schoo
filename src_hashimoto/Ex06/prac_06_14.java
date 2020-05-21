import java.util.Scanner;
import java.util.Random;

public class prac_06_14 {
	public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        String[] month = {"January", "February", "March", 
                        "April", "May", "June", "July", "August", 
                        "September", "October", "November", "December"};

        System.out.println("英語の月名を入力してください。");
        System.out.println("なお、先頭は大文字で、2文字目以降は小文字とします。");

        int n = rand.nextInt(12) + 1;

        while(true) {
            System.out.print(n +"月：");
            String s = stdIn.nextLine();

            if (s.equals(month[n-1])) {
                System.out.print("正解です。もう一度？　1...Yes／0...No：");
                int retry = stdIn.nextInt();
                if(retry != 1) break;

                int t = n;
                do {
                    n = rand.nextInt(12) + 1;
                } while (t == n);

                stdIn.nextLine(); //1行飛ばすだけ

            } else {
                System.out.println("違います。");
            }
        }
    }
}