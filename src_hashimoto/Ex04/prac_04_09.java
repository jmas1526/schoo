import java.util.Scanner;

public class prac_04_09 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        int n;
        do {
            System.out.print("nの値：");
            n = stdln.nextInt();
        } while (n <= 0);

        int pro = 1;

        int i = n;
        while (i > 1) {
            pro *= i;
            i--;
        }

        System.out.println("1から"+ n +"までの積は"+ pro +"です。");
    }
}