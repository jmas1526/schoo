import java.util.Scanner;
import java.util.Random;

public class prac_06_11 {
	public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        int n = 0;
        do {
            System.out.print("要素数：");
            n = stdIn.nextInt();
        } while (n > 10 || n < 0);

        int[] a = new int[n];

        arrayRandom:
        for (int i=0; i<n; i++) {
            a[i] = rand.nextInt(10) + 1;
            for (int j=0; j<i; j++) {
                if (a[i] == a[j]) {
                    i--;
                    continue arrayRandom;
                }
            }
        }

        System.out.print("a = {");
        for (int i=0; i<n; i++) {
            System.out.print(a[i]);
            if(i != n-1)System.out.print(", ");
        }
        System.out.println("}");

    }
}