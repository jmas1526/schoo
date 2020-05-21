import java.util.Scanner;

public class prac_04_23 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        System.out.println("ピラミッドを表示します。");

        int n;
        do {
            System.out.print("段数は：");
            n = stdln.nextInt();
        } while (n < 1);

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                String s = (j > n-i) ? i%10+"" : " ";
                System.out.print(s);
            }
            for (int j=1; j<i; j++) {
                System.out.print(i%10);
            }
            System.out.println();
        }
    }
}