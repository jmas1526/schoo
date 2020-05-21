class Q12_1 {

	public static void main(String[] args) {
		Day today = new Day();
		Car_Extend exCar = new Car_Extend("name",100,100,100,1000,today);
		
		exCar.move(30, 40);
		System.out.println(exCar.getX() + "," + exCar.getY());
		System.out.println(exCar.getTotalDistance());
		System.out.println();
		
		exCar.move(20, 20);
		System.out.println(exCar.getX() + "," + exCar.getY());
		System.out.println(exCar.getTotalDistance());
		System.out.println();
		
		exCar.move(200, 2000);
		System.out.println(exCar.getX() + "," + exCar.getY());
		System.out.println(exCar.getTotalDistance());
	}

}



class Car_Extend extends Car{
	private double totalDistance;

	public Car_Extend(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		super(name, width, height, length, fuel, purchaseDay);
		totalDistance = 0;
	}
	
	public double getTotalDistance(){
		return totalDistance;
	}
	
	
	@Override
	public boolean move(double dx, double dy) {
		if(super.move(dx, dy)){
			totalDistance +=Math.sqrt(dx * dx + dy * dy);
			return  true;
		}else {
			System.out.println("ガソリン不足です。");
			return false;
		}
		
	}

	
	//overrideなし
	/*
	public void exMove(double dx, double dy) {
		if(this.move(dx, dy)){
			totalDistance +=Math.sqrt(dx * dx + dy * dy);
		}else {
			System.out.println("ガソリン不足です。");
		}
		
		
	}
	*/

}

