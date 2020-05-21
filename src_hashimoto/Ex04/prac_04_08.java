import java.util.Scanner;

public class prac_04_08 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        int n;
        do {
            System.out.print("整数値：");
            n = stdln.nextInt();
        } while (n < 0);

        int i = 0;
        do {
            n /= 10;
            i++;
        } while (n > 0);

        System.out.println("その値は"+ i +"桁です。");
    }
}