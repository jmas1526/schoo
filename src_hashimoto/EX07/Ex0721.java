import java.util.Random;

public class Ex0721 {

	public static void main(String[] args) {

		Random rand = new Random();

		final int n1 = rand.nextInt(3)+5;
		final int n2 = rand.nextInt(3)+5;

		int[] a = new int[n1];
		for (int i = 0; i < n1; i++) {
			a[i] = rand.nextInt(10);
		}

		int[] b = new int[n2];
		for (int i = 0; i < n2; i++) {
			b[i] = rand.nextInt(10);
		}

		printIntArray(a, "a");
		printIntArray(b, "b");

		System.out.println("配列aと配列bを入れ替える");

		aryExchng(a, b);

		printIntArray(a, "a");
		printIntArray(b, "b");

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

	static void aryExchng(int[] a, int[] b) {

		int minLen = (a.length < b.length) ? a.length : b.length;
		for (int i=0; i<minLen; i++) {
			int tmp = a[i];
			a[i] = b[i];
			b[i] = tmp;
		}
	}

}