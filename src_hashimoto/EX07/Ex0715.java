public class Ex0715 {

	public static void main(String[] args) {

		System.out.println(sumOf(new int[] { 2, 6, 9, 3 }));

	}

	static int sumOf(int[] a) {

		int sum = 0;
		for (int x : a) {
			sum += x;
		}
		return sum;

	}

}
