import java.util.Scanner;

public class prac_04_13 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        System.out.println("1からnまでの和を求めます。");
        
        int n;
        do {
            System.out.print("nの値：");
            n = stdln.nextInt();
        } while (n <= 0);

        int sum = 0;

        for (int i=1; i <= n; i++){
            sum += i;
        }

        System.out.println("1から"+ n +"までの和は"+ sum +"です。");

    }
}