import java.util.Scanner;
import java.util.Random;

public class prac_06_07 {
	public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        final int n = 12;
        int[] a = new int[n];

        for (int j=0; j<n; j++) {
            a[j] = rand.nextInt(10);
        }

        System.out.print("配列aの全要素の値\n{ ");
        for (int j=0; j<n; j++) {
            System.out.print(a[j]);
            if(j != n-1)System.out.print(", ");
        }

        System.out.println(" }");

        System.out.print("探す数値：");
        int key = stdIn.nextInt();

        int i;
        int flag = -1;
        for (i=0; i<n; i++) {
            if(a[i] == key) flag = i;
        }
        if (flag > -1) {
            System.out.println("それはa["+ flag +"]が最も末尾側です。");
        } else {
            System.out.println("それはありません。");
        }
    }
}