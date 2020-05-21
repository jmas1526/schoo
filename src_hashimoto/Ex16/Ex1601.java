package Ex16;

import java.util.Scanner;

public class Ex1601 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.print("sw:");
		int sw = stdIn.nextInt();

		try {
			test(sw);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


	static void check(int sw) throws Exception {
		switch(sw) {
		 case 1: throw new Exception("検査例外発生!!");
		 case 2: throw new RuntimeException("非検査例外発生!!");
		}
	}

	static void test(int sw) throws Exception {
		check(sw);
	}

}
