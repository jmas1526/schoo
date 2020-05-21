import java.util.Random;
import java.util.Scanner;

public class Ex0726 {

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
			System.out.print("挿入する要素のインデックス：");
			x = stdIn.nextInt();
			if (x < n && x >= 0)
				break;
		}

		System.out.print("挿入する値：");
		int y = stdIn.nextInt();

		printIntArray(arrayInsOf(a, x, y), "rmv");

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

	static int[] arrayInsOf(int[] a, int idx, int x) {

		int[] insdArray = new int[a.length + 1];

		for (int i = 0; i < insdArray.length; i++) {
			if (i == idx) {
				insdArray[i] = x;
			} else if (i > idx) {
				insdArray[i] = a[i - 1];
			} else {
				insdArray[i] = a[i];
			}

		}

		return insdArray;
	}

}