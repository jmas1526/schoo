import java.util.Scanner;

public class prac_04_18 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        int n;
        do {
            System.out.print("nの値：");
            n = stdln.nextInt();
        } while (n < 1);

        for (int i=1; i <= n; i++) {
            System.out.println(i +"の2乗は"+ i*i);
        }
    }
}