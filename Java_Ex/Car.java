public class Car {
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	private Day purchaseDay;
	
	//コンストラクタ
	Car(String name, int width, int height, int length, double fuel, Day purchaseDay){	
		this.name = name;
		this.width = width;
		this.height  = height;
		this.length = length;
		x = y = 0.0;
		this.fuel = fuel;
		this.purchaseDay = new Day(purchaseDay);
	}
	
	//getter
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double getFuel(){
		return fuel;
	}
	public Day getPurchaseDay() {
		return new Day(purchaseDay);
	}
	
	//スペック表示
	public void putSpec(){
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
	}
	
	//移動
	public boolean move(double dx, double dy){
		double dist = Math.sqrt(dx * dx + dy * dy);
		if(dist > fuel) return false;
		else{
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	}
}

