public class Ex0733 {

	public static void main(String[] args) {


		int[] a = {2, 3, 5, 7 ,11};
		int[][] b = { {2, 3}, {5, 7, 11}, {13, 17}, {98, 7654, 32, 1} };

		printArray(a);
		System.out.println();
		printArray(b);

	}

	static void printArray(int[] a) {

		int n = a.length;

		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();

	}


	static void printArray(int[][] a) {

		int max = a[0].length;
		for (int i = 0; i<a.length; i++ ) {
			if (max < a[i].length) max = a[i].length;
		}
		int[] n = new int[max];

		for (int i = 0; i < n.length; i++) {

			for (int j = 0; j<a[i].length; j++) {
				int k = String.valueOf(a[i][j]).length();
				if (n[j] < k) n[j] = k;
			}
		}

		for (int[] i : a) {
			for (int j=0; j<i.length; j++) {
				System.out.print(i[j] + " ");
				int space = n[j] - String.valueOf(i[j]).length();
				for (int k = 0; k<space; k++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}