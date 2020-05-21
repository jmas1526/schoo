import java.util.Random;

public class Ex0722 {

	public static void main(String[] args) {

		Random rand = new Random();

		final int n = rand.nextInt(3)+5;

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(10);
		}

		printIntArray(a, "a");

		System.out.println("配列aのクローンを生成");

		printIntArray(arrayClone(a), "clone");

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

	static int[] arrayClone(int[] a) {

		int[] clone = new int[a.length];

		for (int i=0; i<clone.length; i++) {
			clone[i] = a[i];
		}

		return clone;
	}

}