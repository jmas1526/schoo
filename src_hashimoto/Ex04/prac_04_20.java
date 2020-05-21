import java.util.Scanner;

public class prac_04_20 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        int n;
        do {
            System.out.print("n：");
            n = stdln.nextInt();
        } while (n < 1);

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}