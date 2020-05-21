public class Ex0714 {

	public static void main(String[] args) {

		int x = 123456;
		System.out.printf("x = %d\n", x);

		printBits(x);

		int n = 10;
		System.out.printf("下から%dビット目まで1にする\n", n);

		x = setN(x, n);
		printBits(x);

		n = 15;
		System.out.printf("下から%dビット目まで0にする\n", n);

		x = resetN(x, n);
		printBits(x);

		n = 20;
		System.out.printf("下から%dビット目まで反転する\n", n);

		x = inverseN(x, n);
		printBits(x);

		n = 24;
		System.out.printf("下から%dビット目まで反転する\n", n);

		x = inverseN(x, n);
		printBits(x);

	}

	static void printBits(int x) {
		System.out.print("x = ");
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		System.out.println();
	}

	static int setN(int x, int pos) {

		int t = 0;
		for (int i=0; i<pos; i++) {
			t <<= 1;
			t++;
		}

		return x | t;

	}

	static int resetN(int x, int pos) {

		int t = 0;
		for (int i=0; i<pos; i++) {
			t <<= 1;
			t++;
		}

		return x & ~t;

	}

	static int inverseN(int x, int pos) {

		int t = 0;
		for (int i=0; i<pos; i++) {
			t <<= 1;
			t++;
		}

		return x ^ t;

	}
}
