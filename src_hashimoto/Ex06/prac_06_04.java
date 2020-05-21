import java.util.Scanner;
import java.util.Random;

public class prac_06_04 {
	public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("要素数：");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        int max = 1;

        for (int i=0; i<n; i++) {
            a[i] = 1 + rand.nextInt(10);
            if (a[i] > max) max = a[i];
        }

        for (int i=max; i>0; i--) {
            for (int j=0; j<n; j++) {
                char c = (a[j] >= i) ? '*' : ' ';
                System.out.print(c +" ");
            }
            System.out.println();
        }

        for (int i=0; i<n; i++) {
            System.out.print("--");
        }
        System.out.println();
        for (int i=0; i<n; i++) {
            System.out.print(i%10+" ");
        }
        System.out.println();
        
    }
}