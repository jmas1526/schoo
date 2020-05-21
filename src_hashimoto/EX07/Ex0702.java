
public class Ex0702 {

	public static void main(String[] args) {

		int a = 45;
		int b = 0;
		int c = -9;

		System.out.println(min(a, b, c));

	}

	static int min(int a, int b, int c) {

		int min = a;
		if (min > b) min = b;
		if (min > c) min = c;

		return min;

	}

}