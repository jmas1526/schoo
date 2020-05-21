public class Ex0716 {

	public static void main(String[] args) {

		System.out.println(minOf(new int[] { 12, 3, 5, 7 }));

	}

	static int minOf(int[] a) {

		int min = a[0];
		for (int x : a) {
			if (min > x) min = x;
		}
		return min;

	}

}
