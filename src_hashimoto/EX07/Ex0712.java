public class Ex0712 {

	public static void main(String[] args) {

		int x = -66;
		System.out.printf("x = %d\n", x);

		printBits(x);

		int n = 5;
		System.out.printf("右に%d回転\n", n);

		x = rRotate(x, n);
		printBits(x);

		n = 9;
		System.out.printf("さらに左に%d回転\n", n);

		x = lRotate(x, n);
		printBits(x);

	}

	static void printBits(int x) {
		System.out.print("x = ");
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		System.out.println();
	}

	static int rRotate(int x, int n) {

		int t = x << (32 - n);
		x >>>= n;

		return x + t;

	}

	static int lRotate(int x, int n) {

		int t = x >>> (32 - n);
		x <<= n;

		return x + t;

	}
}
