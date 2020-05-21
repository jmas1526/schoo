import java.util.Scanner;

public class prac_06_06 {
	public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("点数を入力する人数：");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print((i+1)+"人目の点数：");
            a[i] = stdIn.nextInt();
        }

        int max = a[0];
        int min = a[0];
        int sum = 0;
        for (int i=0; i<n; i++) {
            if(a[i] > max) max = a[i];
            if(a[i] < min) min = a[i];
            sum += a[i];
        }
        double ave = (double)sum / n;

        System.out.println("合計点は"+ sum +"点、平均点は"+ ave +"点、最高点は"+ max +"点、最低点は"+ min +"点です。");
    }
}