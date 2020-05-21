import java.util.Scanner;

public class prac_04_21_C {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        System.out.println("右上直角の三角形を表示します。");

        int n;
        do {
            System.out.print("段数は：");
            n = stdln.nextInt();
        } while (n < 1);

        for (int i=n; i>0; i--) {
            for (int j=0; j<n; j++) {
                char c = (j >= n-i) ? '*' : ' ';
                System.out.print(c);
            }
            System.out.println();
        }
    }
}