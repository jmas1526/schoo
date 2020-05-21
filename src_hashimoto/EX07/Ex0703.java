
public class Ex0703 {

	public static void main(String[] args) {

		int a = 45;
		int b = 0;
		int c = -9;

		System.out.println(med(a, b, c));

	}

	static int med(int a, int b, int c) {
		int tmp;
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		if (b > c) {
			tmp = b;
			b = c;
			c = tmp;
		}
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}

		return b;
	}

}
