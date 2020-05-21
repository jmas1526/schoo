public class Ex0730 {

	public static void main(String[] args) {

		int a = 19;
		int b = 8;
		int c = -9;

		int[] d = {2, 4, 6 ,-4, 12};

		System.out.println(min(a, b));
		System.out.println(min(a, b, c));
		System.out.println(min(d));
	}

	static int min(int a, int b) {
		int min = (a < b) ? a : b;
		return min;
	}

	static int min(int a, int b, int c) {
		int min = (a < b) ? a : b;
		if (min > c) min = c;
		return min;
	}

	static int min(int[] a) {
		int min = a[0];
		for (int i : a) {
			if (i < min) min = i;
		}
		return min;
	}

}