import java.util.Random;
import java.util.Scanner;

public class Ex0710 {

	static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {

		Random rand = new Random();

		System.out.println("暗算力トレーニング!!");

		do {
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;

			boolean a = rand.nextBoolean(); //trueなら足してfalseなら引く
			boolean b = rand.nextBoolean(); //同上

			calc(x, y, z, a, b);

		} while (confirmRetry());

	}

	static void calc(int x, int y, int z, boolean a, boolean b) {

		int answer;

		while (true) {


			if (a && b) {
				System.out.printf("%d + %d + %d = ", x, y, z);
				answer = x+y+z;
			}else if (!a && b) {
				System.out.printf("%d - %d + %d = ", x, y, z);
				answer = x-y+z;
			}else if (a && !b) {
				System.out.printf("%d + %d - %d = ", x, y, z);
				answer = x+y-z;
			}else {
				System.out.printf("%d - %d - %d = ", x, y, z);
				answer = x-y-z;
			}

			int n = stdIn.nextInt();

			if (n == answer) break;

			System.out.println("違いますよ!!");
		}

	}

	static boolean confirmRetry() {

		int cont;
		do {
			System.out.print("もう一度？＜Yes...1／No...0＞：");
			cont = stdIn.nextInt();
		} while (cont != 0 && cont != 1);

		return (cont == 1);

	}
}
