public class Ex0731 {

	public static void main(String[] args) {

		int a = 5;
		long b = -8;
		float c = (float) 0.25;
		double d = -3.4;

		System.out.println(absolute(a));
		System.out.println(absolute(b));
		System.out.println(absolute(c));
		System.out.println(absolute(d));

	}

	static int absolute(int x) {
		if (x < 0) x *= -1;
		return x;
	}

	static long absolute(long x) {
		if (x < 0) x *= -1;
		return x;
	}

	static float absolute(float x) {
		if (x < 0) x *= -1;
		return x;
	}

	static double absolute(double x) {
		if (x < 0) x *= -1;
		return x;
	}

}