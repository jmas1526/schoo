import java.util.Random;

public class Ex0720 {

	public static void main(String[] args) {

		Random rand = new Random();

		final int n = 6;

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(10);
		}

		printIntArray(a);

		int k = rand.nextInt(n);
		int r = rand.nextInt(10);

		System.out.printf("a[%d]に%dという要素を挿入\n", k, r);

		aryIns(a, k, r);

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

	static void aryIns(int[] a, int idx, int x) {
		for (int i = a.length-1; i > idx; i--) {
			a[i] = a[i-1];
		}
		a[idx] = x;
	}

}