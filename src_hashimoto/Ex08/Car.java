
public class Car {

	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;

	private double maxFuel; //最大燃料
	private int no; //ナンバー
	private double eco; //燃費(百分率)


	Car(String name, int width, int height, int length, double fuel, double maxFuel, int no, double eco) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0.0;

		this.maxFuel = maxFuel;
		this.no = no;
		this.eco = eco;
	}


	double getX() {
		return x;
	}

	double getY() {
		return y;
	}

	double getFuel() {
		return fuel;
	}

	double getMaxFuel() {
		return maxFuel;
	}



	void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
		System.out.println("タンク容量：" + maxFuel + "L");
		System.out.println("ナンバー：" + no);
		System.out.println("燃費：" + eco + "%");
	}

	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy) * maxFuel / 100;
		if (dist > fuel) {
			return false;
		} else {
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}

	}

	//給油する
	void refuel(double feul) {

		double sum = fuel + this.fuel;
		if (sum > maxFuel) {
			double outFuel = sum - maxFuel;
			this.fuel = maxFuel;
			System.out.println("給油できました。(残量："+ this.fuel +"L)");
			System.out.println(outFuel +"L余りました。");
		} else {
			this.fuel += fuel;
			System.out.println("正常に給油できました。(残量："+ this.fuel +"L)");
		}
	}

}
