import java.util.Scanner;

public class prac_06_16 {
	public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int[][] a = new int[4][3];
        int[][] b = new int[3][4];
        int[][] c = new int[4][4];

        System.out.println("4行3列の行列：");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("A[%d][%d]：", i, j);
                a[i][j] = stdIn.nextInt();
            }
        }

        System.out.println("3行4列の行列：");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("B[%d][%d]：", i, j);
                b[i][j] = stdIn.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k]*b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}