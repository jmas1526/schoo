public class Ex0728 {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] b = { { 6, 3, 4 }, { 5, 1, 2 } };

		System.out.println("行列a");
		printMatrix(a);
		System.out.println("行列b");
		printMatrix(b);
		System.out.println("合計");
		printMatrix(addMatrix(a, b));

	}

	static void printMatrix(int[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();
		}

	}

	static int[][] addMatrix(int[][] x, int[][] y) {

		int[][] z = new int[x.length][x[0].length];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}

		return z;

	}

}