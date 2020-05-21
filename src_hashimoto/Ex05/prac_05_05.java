import java.util.Scanner;

public class prac_05_05 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        System.out.print("整数値A ：");
        int a = stdln.nextInt();
        System.out.print("整数値B ：");
        int b = stdln.nextInt();
        System.out.print("整数値C ：");
        int c = stdln.nextInt();

        int sum = a+b+c;
        double ave = (double)sum / 3;

        System.out.println("合計は"+ sum +"、平均は"+ ave +"です。");
    }
}