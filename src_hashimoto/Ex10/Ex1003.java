
public class Ex1003 {

	public static void main(String[] args) {

		int a = 3;
		int b = 5;
		int c = -3;

		double d = 3.3;
		double e = 2.2;
		double f = 2.5;

		int[] g = {2, 3, 5, 7, 11};
		double[] h = {0.0, 2.7, -3.4};

		System.out.println("MinMax.min(a, b) = " + MinMax.min(a, b));
		System.out.println("MinMax.min(a, b, c) = " + MinMax.min(a, b, c));
		System.out.println("MinMax.min(g) = " + MinMax.min(g));
		System.out.println("MinMax.min(d, e) = " + MinMax.min(d, e));
		System.out.println("MinMax.min(d, e, f) = " + MinMax.min(d, e, f));
		System.out.println("MinMax.min(h) = " + MinMax.min(h));

		System.out.println("MinMax.max(a, b) = " + MinMax.max(a, b));
		System.out.println("MinMax.max(a, b, c) = " + MinMax.max(a, b, c));
		System.out.println("MinMax.max(g) = " + MinMax.max(g));
		System.out.println("MinMax.max(d, e) = " + MinMax.max(d, e));
		System.out.println("MinMax.max(d, e, f) = " + MinMax.max(d, e, f));
		System.out.println("MinMax.max(h) = " + MinMax.max(h));

		System.out.println("MinMax.max(a, b, d) = " + MinMax.max(a, b, d));


	}
}