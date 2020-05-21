import java.util.Scanner;

public class Ex0802 {

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
		System.out.print("タンク容量は：");
		double maxFuel = stdIn.nextDouble();
		double fuel;
		while (true) {
			System.out.print("ガソリン量は：");
			fuel = stdIn.nextDouble();

			if(fuel <= maxFuel) break;
			System.out.println("入りきりません");
		}
		System.out.print("ナンバーは：");
		int no = stdIn.nextInt();
		System.out.print("燃費(%)は：");
		double eco = stdIn.nextDouble();

		Car myCar = new Car(name, width, height, length, fuel, maxFuel, no, eco);


		carControl:
		while (true) {
			System.out.println("現在地(" + myCar.getX() + ", " + myCar.getY() + ")・残り燃料 " + myCar.getFuel());
			System.out.print("[移動する…0／燃料を入れる…1／車の詳細を確認する…2／終わる…3]：");

			int a = stdIn.nextInt();

			switch(a) {
			case 0:
				System.out.print("X方向の移動距離：");
				double dx = stdIn.nextDouble();
				System.out.print("Y方向の移動距離：");
				double dy = stdIn.nextDouble();

				if (!myCar.move(dx, dy)) {
					System.out.println("燃料が足りません");
				}
				break;

			case 1:
				System.out.print("補給する量：");
				double df = stdIn.nextDouble();
				myCar.refuel(df);
				break;

			case 2:
				myCar.putSpec();
				break;

			case 3:
				break carControl;

			}

		}

	}
}