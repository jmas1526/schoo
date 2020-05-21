import java.util.Random;
import java.util.Scanner;

public class Ex0724 {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		final int n = rand.nextInt(3) + 5;

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(10);
		}

		printIntArray(a, "a");

		int x;
		while (true) {
			System.out.print("削除する要素のインデックス：");
			x = stdIn.nextInt();
			if (x < n && x >= 0)
				break;
		}

		printIntArray(arrayRmvOf(a, x), "rmv");

	}

	static void printIntArray(int[] a, String s) {

		System.out.printf("配列%sの全要素の値\n{ ", s);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1)
				System.out.print(", ");
		}
		System.out.println(" }");
	}

	static int[] arrayRmvOf(int[] a, int idx) {

		int[] rmvdArray = new int[a.length - 1];

		for (int i = 0; i < rmvdArray.length; i++) {
			int t = (i >= idx) ? 1 : 0;
			rmvdArray[i] = a[i + t];
		}

		return rmvdArray;
	}

}