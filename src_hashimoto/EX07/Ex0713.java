public class Ex0713 {

	public static void main(String[] args) {

		int x = 839;
		System.out.printf("x = %d\n", x);

		printBits(x);

		int n = 5;
		System.out.printf("下から%dビット目を1にする\n", n);

		x = set(x, n);
		printBits(x);

		n = 8;
		System.out.printf("下から%dビット目を0にする\n", n);

		x = reset(x, n);
		printBits(x);

		n = 3;
		System.out.printf("下から%dビット目を反転する\n", n);

		x = inverse(x, n);
		printBits(x);

		n = 6;
		System.out.printf("下から%dビット目を反転する\n", n);

		x = inverse(x, n);
		printBits(x);

	}

	static void printBits(int x) {
		System.out.print("x = ");
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		System.out.println();
	}

	static int set(int x, int pos) {

		int t = 1;
		t <<= pos;

		return x | t;

	}


	static int reset(int x, int pos) {

		int t = 1;
		t <<= pos;

		return x & ~t;

	}

	static int inverse(int x, int pos) {

		int t = 1;
		t <<= pos;

		return x ^ t;

	}
}
