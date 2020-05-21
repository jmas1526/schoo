import java.util.Scanner;

public class prac_04_17 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        int n;
        do {
            System.out.print("整数値：");
            n = stdln.nextInt();
        } while (n < 1);

        int count = 0;

        for (int i=1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("約数は"+ count + "個です。");
    }
}