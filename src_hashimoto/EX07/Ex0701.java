
public class Ex0701 {

	public static void main(String[] args) {

		int a = 45;
		int b = 0;
		int c = -9;

		System.out.println(signOf(a));
		System.out.println(signOf(b));
		System.out.println(signOf(c));

	}

	static int signOf(int n) {
		if (n > 0) {
			return 1;
		} else if (n == 0) {
			return 0;
		} else {
			return -1;
		}
	}

}

