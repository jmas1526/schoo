import java.util.Random;
import java.util.Scanner;

public class Ex0717 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        final int n = 6;

        int[] a = new int[n];

        for (int j=0; j<n; j++) {
            a[j] = rand.nextInt(10);
        }

		System.out.print("配列aの全要素の値\n{ ");
		for (int j = 0; j < n; j++) {
			System.out.print(a[j]);
			if (j != n - 1)
				System.out.print(", ");
		}

		System.out.println(" }");

		System.out.print("探す数値：");
		int key = stdIn.nextInt();

		int idx = linearSearchR(a, key);

		if (idx == -1) {
			System.out.println("それはありません。");
		} else {
			System.out.println("それはa[" + idx + "]が最も末尾側です。");
		}

	}

	static int linearSearchR(int[] a, int key) {

		int k = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key)
				k = i;
		}
		return k;
	}

}

