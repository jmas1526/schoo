import java.util.Scanner;

public class prac_05_01 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        System.out.print("整数：");
        int n = stdln.nextInt();

        System.out.printf("8進数では%oです。\n", n);
        System.out.printf("16進数では%xです。\n", n);
    }
}