package Ex16;

import java.util.Scanner;

public class Ex1603 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int num = stdIn.nextInt();

		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		//x = null;

		reverse(x);

		System.out.println("要素の並びを反転しました。");
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] = " + x[i]);
		}

	}

	static void reverse(int[] a) {

		try {

			for (int i = 0; i < a.length / 2; i++) {
				swap(a, i, a.length - i);
			}

		} catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();
			System.exit(1);

		} catch (NullPointerException e) {

			System.out.println("空参照です。");
			System.exit(1);

		}

	}


	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
}
