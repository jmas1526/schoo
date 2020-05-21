import java.util.Scanner;

public class prac_04_21_A {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        System.out.println("左上直角の三角形を表示します。");

        int n;
        do {
            System.out.print("段数は：");
            n = stdln.nextInt();
        } while (n < 1);

        for (int i=n; i>0; i--) {
            for (int j=0; j<i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}