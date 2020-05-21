package Ex16;

import java.util.Scanner;

class RangeErrow extends RuntimeException {
	RangeErrow(int n) { super("範囲外の値：" + n); }
}

class ParameterRangeErrow extends RangeErrow {
	ParameterRangeErrow(int n) { super(n); }
}

class ResultRangeErrow extends RangeErrow {
	ResultRangeErrow(int n) { super(n); }
}


public class Ex1602 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");
		int a = stdIn.nextInt();
		System.out.print("整数b：");
		int b = stdIn.nextInt();

		try {
			System.out.println("それらの和は" + add(a, b) + "です");
		} catch (RuntimeException e) {
			if (e instanceof ParameterRangeErrow)
			System.out.println("加える数が範囲外です。" + e.getMessage());
			else if (e instanceof ResultRangeErrow)
			System.out.println("計算結果が範囲外です。" + e.toString());
		}

	}


	static boolean isValid(int n) {
		return n >= 0 && n <= 9;
	}

	static int add(int a, int b) {
		if (!isValid(a)) throw new ParameterRangeErrow(a);
		if (!isValid(b)) throw new ParameterRangeErrow(b);
		int result = a+b;
		if (!isValid(result)) throw new ResultRangeErrow(result);
		return result;
	}

}
