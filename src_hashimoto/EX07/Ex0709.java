import java.util.Scanner;

public class Ex0709 {

	public static void main(String[] args) {

		System.out.println(readPlusInt());

	}

	static int readPlusInt() {

		Scanner stdIn = new Scanner(System.in);

		int n;
		do {
			System.out.print("正の整数値：");
			n = stdIn.nextInt();
		} while (n <= 0);

		return n;

	}
}
