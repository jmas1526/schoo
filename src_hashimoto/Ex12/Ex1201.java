package Ex12;
import java.util.Scanner;

public class Ex1201 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("車のデータを入力せよ。");
		System.out.print("名前は：");
		String name = stdIn.next();
		System.out.print("車幅は：");
		int width = stdIn.nextInt();
		System.out.print("高さは：");
		int height = stdIn.nextInt();
		System.out.print("長さは：");
		int length = stdIn.nextInt();
		System.out.print("ガソリン量は：");
		double fuel = stdIn.nextDouble();
		ExCar myCar = new ExCar(name, width, height, length, fuel, new Day());

		while (true) {
			System.out.println("現在地(" + myCar.getX() + ", " + myCar.getY() + ")");
			System.out.println("総移動距離 " + myCar.getDistance());
			System.out.println("残り燃料 " + myCar.getFuel());

			System.out.print("[移動する…1／車を確認する…2／終わる…0]：");
			int a = stdIn.nextInt();

			if(a == 0) break;

			else if(a == 1) {

				System.out.print("X方向の移動距離：");
				double dx = stdIn.nextDouble();
				System.out.print("Y方向の移動距離：");
				double dy = stdIn.nextDouble();

				if (!myCar.move(dx, dy)) {
					System.out.println("燃料が足りません");
				}

			} else if (a == 2) {

				myCar.putSpec();
				System.out.println("購入日：" + myCar.getPurchaseDay());

			}

		}

	}
}