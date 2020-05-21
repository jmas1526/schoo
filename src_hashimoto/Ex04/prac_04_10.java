import java.util.Scanner;

public class prac_04_10 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);
        System.out.print("何個*を表示しますか：");
        int n = stdln.nextInt();

        for (int i=0; i < n; i++) {
            System.out.print('*');
        }

        if (n >= 1) {
            System.out.println();
        }
    }
}