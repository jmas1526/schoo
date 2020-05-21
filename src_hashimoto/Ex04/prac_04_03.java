import java.util.Scanner;

public class prac_04_03 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        System.out.print("整数A：");
        int a = stdln.nextInt();
        System.out.print("整数B：");
        int b = stdln.nextInt();

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        do {
            System.out.print(a+" ");
            a++;
        } while (a <= b);
    }
}