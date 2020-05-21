import java.util.Scanner;

public class prac_06_19 {
	public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int[][] a;

        System.out.print("クラス数：");
        int n = stdIn.nextInt();
        System.out.println();

        a = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.printf("%d組の人数：", (i+1));
            int x = stdIn.nextInt();
            a[i] = new int[x];
            for (int j = 0; j < x; j++) {
                System.out.printf("%d組%d番の点数：", (i+1), (j+1));
                int y = stdIn.nextInt();
                a[i][j] = y;
            }
            System.out.println();
        }

        System.out.println("組   合計   平均");
        System.out.println("----------------");
        int sumAll = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
                count++;
            }
            double ave = (double)sum/a[i].length;
            System.out.printf("%d組 %6d %5.1f\n", (i+1), sum, ave);
            sumAll += sum;
        }
        System.out.println("----------------");
        System.out.printf("計  %6d %5.1f\n", sumAll, (double)sumAll/count);
    }
}