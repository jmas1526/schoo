import java.util.Scanner;

public class prac_04_24 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        int n;
        while(true) {
            System.out.print("整数値：");
            n = stdln.nextInt();
            if(n>0) break;
        }

        boolean flag = true;
        if(n==1) flag = false;

        for (int i=2; i<n; i++) {
            if (n%i == 0) {
                flag = false;
                break;
            }
        }
        String s = flag ? "は素数です。" : "は素数ではありません。";
        System.out.println(n + s);
    }
}