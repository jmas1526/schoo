import java.util.Scanner;
import java.util.Random;

public class prac_06_12 {
	public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("要素数：");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("a["+i+"] = ");
            a[i] = stdIn.nextInt();
        }

        int[] tmp = new int[n];
        arrayRandom:
        for (int i=0; i<n; i++) {
            tmp[i] = rand.nextInt(n);
            for (int j=0; j<i; j++) {
                if (tmp[i] == tmp[j]) {
                    i--;
                    continue arrayRandom;
                }
            }
        }

        for (int i=0; i<n; i++) {
            tmp[i] = a[tmp[i]];
        }

        for (int i=0; i<n; i++) {
            a[i] = tmp[i];
        }

        System.out.print("a = {");
        for (int i=0; i<n; i++) {
            System.out.print(a[i]);
            if(i != n-1)System.out.print(", ");
        }
        System.out.println("}");
    }
}