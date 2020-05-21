package Ex12;

public class ExCar extends Car {

	private double distance = 0.0;//総走行距離

	ExCar(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		super(name, width, height, length, fuel, purchaseDay);
	}


	public double getDistance() {
		return distance;
	}

	@Override
	boolean move(double dx, double dy) {
		if(super.move(dx, dy)) {
			distance += dx + dy;
			return true;
		}
		return false;
	}

}
