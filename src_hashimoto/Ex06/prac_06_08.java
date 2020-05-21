import java.util.Scanner;

public class prac_06_08 {
	public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int n = stdIn.nextInt();
        double[] a = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("a["+ i +"]の値：");
            a[i] = stdIn.nextDouble();
        }

        double sum = 0;
        for (double d : a) {
            sum += d;
        }
        double ave = sum / a.length;

        System.out.println("合計値は"+ sum +"、平均値は"+ ave +"です。");
    }
}