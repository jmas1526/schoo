import java.util.Random;

public class Ex0719 {

	public static void main(String[] args) {

		Random rand = new Random();

		final int n = 6;

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(10);
		}

		printIntArray(a);

		int k = rand.nextInt(3);
		int r = rand.nextInt(3) + 1;

		System.out.printf("a[%d]から%dつの要素を削除\n", k, r);

		aryRmvN(a, k, r);

		printIntArray(a);

	}

	static void printIntArray(int[] a) {

		System.out.print("配列aの全要素の値\n{ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1)
				System.out.print(", ");
		}
		System.out.println(" }");
	}

	static void aryRmvN(int[] a, int idx, int n) {
		for (int i = idx; i < a.length - n; i++) {
			a[i] = a[i + n];
		}
	}

}