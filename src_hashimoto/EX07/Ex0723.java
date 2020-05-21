import java.util.Random;
import java.util.Scanner;

public class Ex0723 {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		final int n = rand.nextInt(3) + 5;

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(10);
		}

		printIntArray(a, "a");

		System.out.print("インデックスの配列を生成する値：");
		int x = stdIn.nextInt();

		printIntArray(arraySrchIdx(a, x), "idxArray");

	}

	static void printIntArray(int[] a, String s) {

		System.out.printf("配列%sの全要素の値\n{ ", s);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1)
				System.out.print(", ");
		}
		System.out.println(" }");
	}

	static int[] arraySrchIdx(int[] a, int x) {

		int n = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				n++;
			}
		}

		int[] idxArray = new int[n];

		n = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				idxArray[n] = i;
				n++;
			}
		}

		return idxArray;
	}

}