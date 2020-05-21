import java.util.Scanner;

public class prac_06_18 {
	public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int[][] c;

        System.out.print("行数：");
        int n = stdIn.nextInt();

        c = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.printf("%d行目の列数：", (i+1));
            int a = stdIn.nextInt();
            c[i] = new int[a];
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.printf("%d行目%d列目：", (i+1), (j+1));
                int a = stdIn.nextInt();
                c[i][j] = a;
            }
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.printf("%3d", c[i][j]);
            }
            System.out.println();
        }
    }
}