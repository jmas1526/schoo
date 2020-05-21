import java.util.Scanner;
import java.util.Random;

public class prac_06_09 {
	public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("要素数：");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i=0; i<n; i++) {
            a[i] = rand.nextInt(10) + 1;
        }

        System.out.print("a = {");
        for (int i=0; i<n; i++) {
            System.out.print(a[i]);
            if(i != n-1)System.out.print(", ");
        }

        System.out.println("}");

    }
}