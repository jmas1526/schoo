
public class MinMax {


	//最小値を求めるメソッドmin

	public static int min(int a, int b) {
		int min = (a < b) ? a : b;
		return min;
	}

	public static int min(int a, int b, int c) {
		int min = (a < b) ? a : b;
		if (min > c) min = c;
		return min;
	}

	public static int min(int a[]) {
		int min = a[0];
		for (int i : a) {
			if (min > i) min = i;
		}
		return min;
	}

	public static double min(double a, double b) {
		double min = (a < b) ? a : b;
		return min;
	}

	public static double min(double a, double b, double c) {
		double min = (a < b) ? a : b;
		if (min > c) min = c;
		return min;
	}

	public static double min(double a[]) {
		double min = a[0];
		for (double d : a) {
			if (min > d) min = d;
		}
		return min;
	}



	//最大値を求めるメソッドmax

	public static int max(int a, int b) {
		int max = (a > b) ? a : b;
		return max;
	}

	public static int max(int a, int b, int c) {
		int max = (a > b) ? a : b;
		if (max < c) max = c;
		return max;
	}

	public static int max(int a[]) {
		int max = a[0];
		for (int i : a) {
			if (max < i) max = i;
		}
		return max;
	}

	public static double max(double a, double b) {
		double max = (a > b) ? a : b;
		return max;
	}

	public static double max(double a, double b, double c) {
		double max = (a > b) ? a : b;
		if (max < c) max = c;
		return max;
	}

	public static double max(double a[]) {
		double max = a[0];
		for (double d : a) {
			if (max < d) max = d;
		}
		return max;
	}




}
