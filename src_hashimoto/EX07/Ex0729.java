import java.util.Random;

public class Ex0729 {

	public static void main(String[] args) {

		Random rand = new Random();

		final int n1 = rand.nextInt(2) + 2;
		final int n2 = rand.nextInt(4) + 2;

		int[][] a = new int[n1][n2];
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				a[i][j] = rand.nextInt(10);
			}
		}

		printIntArray2(a, "a");

		System.out.println("配列aのクローンを生成");

		printIntArray2(arrayClone2(a), "clone");

	}

	static void printIntArray2(int[][] a, String s) {

		System.out.printf("配列%sの全要素の値\n{ ", s);
		for (int i = 0; i < a.length; i++) {
			if (i != 0)
				System.out.print("  ");
			System.out.print("{ ");
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
				if (j != a[i].length - 1)
					System.out.print(", ");
			}
			System.out.print(" }");
			if (i != a.length - 1)
				System.out.print(", \n");
		}
		System.out.println(" }");
	}

	static int[][] arrayClone2(int[][] a) {

		int[] n = new int[a.length];

		for (int i = 0; i < n.length; i++) {
			n[i] = a[i].length;
		}

		int[][] clone = new int[a.length][];

		for (int i = 0; i < clone.length; i++) {
			clone[i] = new int[n[i]];
		}

		for (int i = 0; i < clone.length; i++) {
			for (int j = 0; j < clone[i].length; j++) {
				clone[i][j] = a[i][j];
			}
		}

		return clone;

	}

}