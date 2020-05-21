public class Ex0732 {

	public static void main(String[] args) {


		byte a = 108;
		short b = 23555;
		int c = 123456;
		long d = 123456789;

		printBits(a);
		System.out.println();
		printBits(b);
		System.out.println();
		printBits(c);
		System.out.println();
		printBits(d);
		System.out.println();

	}

	static void printBits(byte x) {
		for (int i=7; i>=0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	static void printBits(short x) {
		for (int i=15; i>=0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	static void printBits(int x) {
		for (int i=31; i>=0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	static void printBits(long x) {
		for (int i=63; i>=0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

}