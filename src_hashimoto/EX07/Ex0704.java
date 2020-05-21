
public class Ex0704 {

	public static void main(String[] args) {

		int a = 12;
		System.out.println(sumUp(a));

	}

	static int sumUp(int n) {
		int sum = 0;
		for (int i=1; i<=n; i++) {
			sum += i;
		}
		return sum;
	}

}
